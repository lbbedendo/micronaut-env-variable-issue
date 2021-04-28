## Problem

This application (using Micronaut 2.4.4) is not resolving the `EVENTS_SUBSCRIPTION_SECRET` environment variable. The placeholder, instead, `${EVENTS_SUBSCRIPTION_SECRET}` is kept inaltered.
The other two environment variables (`${HERMES_MANAGEMENT_URL}` and `${EVENTS_TOPIC_NAME}`) are resolved as expected.

## Reproducing the issue

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
outbox.event.test
${EVENTS_SUBSCRIPTION_SECRET}
16:23:03.487 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 771ms. Server Running: http://localhost:8080
```

PS: The variables are printed in the `Init` class.