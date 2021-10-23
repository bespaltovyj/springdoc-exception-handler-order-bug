## Problem
This application is an example with bug in which documentation is incorrectly displayed.
Instead of information from the local handler, information about the global one is displayed

## Steps to reproduce
1. Run application `gradble bootRun`
2. Open [OpenApi docs](http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/test-controller/getBody)
3. Check body for 500 http status.
4. Body is `GlobalErrorDto`, but `LocalErrorDto` is expected because it has a higher priority.