# Microservices-SpringBoot-SpringCloud
  https://www.udemy.com/course/spring-boot-microservices-and-spring-cloud/


### Eureka Server - PhotoDiscoveryService & Cloud Gateway - APIGateway

mvn spring-boot:run


### Eureka Account Management Client (2 instances)

mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8081 --spring.application.instance_id=account-instance1"

mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8082 --spring.application.instance_id=account-instance2"
  

### Add Eureka User Client - PhotoDiscoveryUsersClient (1 instance)


mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8083 --spring.application.instance_id=users-instance1"

