# exemplo-restservice-oauth2-springboot
Projeto de exemplo da utilização do oauth2 do Springboot para proteção da camada de serviços rest.

## Frameworks utilizados
* Java 8 
* Spring Boot
* Gradle

### Url pública: ###
http://localhost:8080/hello

### Url protegida pelo OAuth2 ###
http://localhost:8080/api/users

### Como conseguir o OAuth2 token ###
curl oauth2_restservice:oauth2secret@localhost:8080/oauth/token -d grant_type=password -d username=user@email.com -d password=user http://localhost:8080/oauth/token

### Mais informações sobre OAuth2 do Springboot ###
https://spring.io/guides/tutorials/spring-boot-oauth2/
