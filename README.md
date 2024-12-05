# Jitsu Project

This is an automation testing project using **Java**, **Selenium WebDriver**, and **Rest Assured**. The project includes both **UI automation** (using Selenium) and **API automation** (using Rest Assured).

## Table of Contents
1. [Project Overview](#project-overview)
2. [Requirements](#requirements)
3. [Running Tests](#running-tests)
4. [License](#license)

## Project Overview
This project is designed to test both web applications (using Selenium WebDriver) and REST APIs (using Rest Assured). It is useful for teams implementing both **UI-based** and **API-based** automated tests.

### Key Features:
- Selenium WebDriver for **browser-based automation** (Chrome, Firefox, etc.).
- Rest Assured for **API testing** with authentication and response validation.
- Integration with **JUnit** for running tests.
- **Maven** for project dependency management and build automation.
#### For UI testing
- Access to Gmail platform.
- Compose a new email.
- Send the composed email.
- Validate the successful sent email.
#### For API testing
- Call to get all repositories belongs to a specified owner.
- Return the total open issues across all repositories belongs to the owner.
- Sort the repositories in order of descending updated date.
- Return the most watcher repository of the owner.

## Requirements
- Java 17
- Maven 3.8+ (for dependency management)
- WebDriver (e.g., ChromeDriver) compatible with your browser
- IDE (IntelliJ IDEA)

## Running Tests
mvn clean test
###### Do not forget to adjust the *TestRunner.java filename in pom.xml file to build for WebTestRunner.java or APITestRunner.java

## License
In case the required token using for sending request to Github expired, please contact to me via Zalo account as phone number 0773 435 453 to get the token.



