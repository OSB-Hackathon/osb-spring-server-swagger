**Readme for updating server specific code using spring:**

Follow the instructions below to update your server specific code using spring:

1. Log into your Github account and clone the source code from the GitHub repo: osb-spring-server.
2. Extract the source files in your local system.
3. With the help of the table below, update the file name and function name for each of the tasks that you wish to configure for your service.

| S.No | Task Name                                                     | File Name | Function Name |
|------|---------------------------------------------------------------|-----------|---------------|
| 1    | Get a Service instance                                        |           |               |
| 2    | Provisioning new service instance                             |           |               |
| 3    | Deprovisioning service instance                               |           |               |
| 4    | Update a service instance                                     |           |               |
| 5    | Get the latest requested operation state for service instance |           |               |
| 6    | Get a service binding                                         |           |               |
| 7    | Generate a service binding                                    |           |               |
| 8    | Deprovision a service binding                                 |           |               |
| 9    | Get the latest requested operation state for service binding  |           |               |
| 10   | Get Catalog                                                   |           |               |

4. Commit the code changes and push the changes to the main branch.
5. Run the update.sh script to update the broker image and to deploy your service specific code.

**Expected Output:**
The URL of the broker service that can be used in onboarding the service.