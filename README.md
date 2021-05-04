# Test Automation Skeleton 
Check out this repo to get skeleton project for test automation using 

- Spring Boot
- Cucumber Java BDD
- TestNG
- Selenium (For Web Applicaiton) 
- Rest Template (For SOAP and REST web services)

Author : Anupam Kumar

Github : https://github.com/er-anupamkumar 

## Tools Requirements

- IntelliJ / Eclipse
- Java 11
- Maven
- Open API spec (Swagger support)
- Plugins : 
    - Cucumber for java
    - Lombok
    - gherkin
    - google-code-format

## How to run 

SET below fields in application-ABC.yml file 

````
````

Then run below command in terminal

````
mvn clean verify -Dcucumber.filter.tags="@<Tag to Execute>" -DtestEnvironment=ABC
````
### Predefined Tags
- @Regression : to execute all tests
- @Component
- @Sanity
- @Smoke

## Html Reports

The html report is generated at below location. It can be opened in any browser

````
/target/html-reports/cucumber-html-reports/
````

### Formatting
Run this command before pushing the code
````
mvn com.coveo:fmt-maven-plugin:format
````

## Debugging with IntelliJ
Update the attribute `spring.profiles.active`in application.yml with the target environment you want to run your tests
against and execute the feature in debug mode

`bash
spring.profiles.active=ABC
`