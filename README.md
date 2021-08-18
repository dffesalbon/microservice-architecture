## Microservice Architecture using Spring Boot

Architecture Diagram

### Follow these instructions to get each applications/services running:
   **INITIAL SET UP..**
 - Go to/open the **config-profiles** folder. 
 - Open terminal or bash.
 - Initialize git by running these commands 
 > git init
 > git add .
 > git commit -m "sample commit"

  ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/profilesgit.PNG?raw=true)

   **STARTING SERVICE REGISTRY..**
 - Go to/open the **config service** folder. Either in Eclipse or a terminal.
 - Start the application. (Eclipse) -> Run as Spring boot (I have this for mine)
 - Start the application. (Maven) -> Please see maven documentations.
 - Go to/open the **eureka registry** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/eureka.PNG?raw=true)

   **SETTING UP GATEWAY..**
 - Go to/open the **zuul gateway** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/gateway.PNG?raw=true)

   **STARTING SAMPLE APPLICATION/SERVICE..**
 - Go to/open the **user-service** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/user-service.PNG?raw=true)

   **STARTING ANOTHER SAMPLE APPLICATION/SERVICE..**
 - Go to/open the **group-service** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/group-service.PNG?raw=true)

Properties (ports, routes) of each application could be found and modified on the centralized cloud configuration repository (**config-profiles** folder)
