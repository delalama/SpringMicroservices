# SPRING CLOUD MICROSERVICES    

- STEPS

Add register service

- _netflix-eureka-server_
  
  This is the service responsible for registering all remaining microservices.

- _Spring Boot Admin_

  Is a web application, used for managing and monitoring Spring Boot applications. Each application is considered as a client and registers to the admin server

- _Spring Config Server_

  Storing and serving distributed configurations across multiple applications and environments.

- _Zuul Proxy_

  JVM based router and server side load balancer by Netflix. And Spring Cloud has a nice integration with an embedded Zuul proxy – which is what we'll use here.






# PORTS RESUME
eureka     -> 8761

admin      -> 8080

config     -> 8888

Zuul Proxy -> 8000

Greeting   -> 8001

Time       -> 7001

Pokemon    -> 7002