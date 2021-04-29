## Description

This project uses Micronaut's `@EachProperty` annotation to bind from a list defined in `application.yml`. I decided to create this example after trying to use `@ConfigurationProperties` instead, which is not designed to bind from a list.

## Configuration

```yaml
hermes:
  management:
    enabled: true
    url: ${HERMES_MANAGEMENT_URL}
    topics:
      - name: ${EVENTS_TOPIC_NAME}
        owner:
          source: source-1
          id: id-1
        subscription:
          name: test-app
          endpoint: http://my-endpoint
          secret: ${EVENTS_SUBSCRIPTION_SECRET}
          policy:
            rate: 400
            message-ttl: 3600
            message-backoff: 1000
            retry-client-errors: false
            request-timeout: 1000
            socket-timeout: 500
            inflight-size: 100
            backoff-multiplier: 1
            backoff-max-interval-in-sec: 600
          owner:
            source: source-2
            id: id-2
```

You can notice that the object "owner" appears in different places (both as a property of "topics" and as a property of "subscription"). 
In order to avoid creating an `Owner` class twice as an inner class of `TopicConfiguration` and of `SubscriptionConfiguration` I created an abstract class `Owner` and used it as an parent class of `TopicOwner` and `SubscriptionOwner` (which are both annotated with `@ConfigurationProperties`).

## Original problem

This application (using Micronaut 2.4.4) was using `@ConfigurationProperties` to bind from a list and wasn't resolving the `EVENTS_SUBSCRIPTION_SECRET` environment variable. The placeholder, instead, `${EVENTS_SUBSCRIPTION_SECRET}` was kept inaltered.
The other two environment variables (`${HERMES_MANAGEMENT_URL}` and `${EVENTS_TOPIC_NAME}`) were being resolved as expected.

## Running the application

1. Export the environment variables present in "env" file:
```
source env
```

2. Run application:
```
./gradlew run
```

3. Expected result:
```
 __  __ _                                  _   
|  \/  (_) ___ _ __ ___  _ __   __ _ _   _| |_ 
| |\/| | |/ __| '__/ _ \| '_ \ / _` | | | | __|
| |  | | | (__| | | (_) | | | | (_| | |_| | |_ 
|_|  |_|_|\___|_|  \___/|_| |_|\__,_|\__,_|\__|
  Micronaut (v2.4.4)

http://localhost:8090
Topic name: outbox.event.test
Topic owner: TopicOwner{source='source-1', id='id-1'}
Subscription secret: my-secret-123
Subscription policy: Policy{rate=400, messageTtl=3600, messageBackoff=1000, retryClientErrors=false, requestTimeout=1000, socketTimeout=500, inflightSize=100, backoffMultiplier=1.0, backoffMaxIntervalInSec=600}
Subscription owner: TopicOwner{source='source-2', id='id-2'}
```