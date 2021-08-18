## Microservice Architecture using Spring Boot

### Architecture Diagram

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/architecture.jpeg?raw=true)

### Follow these instructions to get each applications/services running:
   **INITIAL SET UP..**
 - Go to/open the **config-profiles** folder. 
 - Open terminal or bash.
 - Initialize git by running these commands 
```sh
git init
git add .
git commit -m "sample commit"
```

  ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/profilesgit.PNG?raw=true)

   **STARTING SERVICE REGISTRY..**
 - Go to/open the **config service** folder. Either in Eclipse or a terminal.
 - Please make sure that the config.server.git.uri is **config-profiles** folder directory
  ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/profilesdir.PNG?raw=true)
 - Start the application. (Eclipse) -> Run as Spring boot (I have this for mine)
 - Start the application. (Maven) -> Please see maven documentations.
 - Go to/open the **eureka registry** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)
 - Visit http://localhost:8001 on your browser

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/eureka.PNG?raw=true)
 
 You should see something like the picture above

   **SETTING UP GATEWAY..**
 - Go to/open the **zuul gateway** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/gateway.PNG?raw=true)
 
 You should see something like the picture above

   **STARTING SAMPLE APPLICATION/SERVICE..**
 - Go to/open the **user-service** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/user-service.PNG?raw=true)
 
 You should see something like the picture above

   **STARTING ANOTHER SAMPLE APPLICATION/SERVICE..**
 - Go to/open the **group-service** folder. Either in Eclipse or a terminal.
 - Same with previous steps -> Start the application (Eclipse or Maven)

![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/group-service.PNG?raw=true)

You should see something like the picture above

 After all steps are followed, visiting http:localhost:8001 should be something like this:
 
 ![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/up-all.PNG?raw=true)

### Note:
> Properties (ports, routes) of each application could be found and modified on the centralized cloud configuration repository (**config-profiles** folder)

### Configuration Profiles Diagram

![alt text](https://github.com/danielfesalbon/microservice-architecture/blob/main/img/cloud-config.jpeg?raw=true)

