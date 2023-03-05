# Strategy
Browser turn based strategy game

## Running
1. Run Docker Compose with MongoDB service: ``` docker-compose up -d ```.
2. Create ``` application-local.yaml ``` files in ``` src/main/resources/ ``` and ``` src/test/resources/ ``` directories.
3. Run Maven with Spring Boot application: ``` mvn spring-boot:run ```.

## Configuring (optional)
- Create .env file in the root of project with:
  - **DOCKER_MONGO_ROOT_USERNAME** (default value is * *root* *)
  - **DOCKER_MONGO_ROOT_PASSWORD** (default value is * *root* *)
- Override default configuration values in ``` application-local.yaml ``` files.
