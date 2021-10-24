## About this template

This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.

## Installing this template

    gauge --install java_maven_selenium

## Building on top of this template
Libraries
This app takes use of the following libraries:

## Libraries

Selenium (•_•) Selenium is an umbrella project encapsulating a variety of tools and libraries enabling web browser automation.
![image](https://user-images.githubusercontent.com/39453835/138594068-b8aee26c-518b-4181-901b-38c695475482.png)

Junit (•_•) JUnit is a unit testing framework for the Java programming language. JUnit has been important in the development of test-driven development
![image](https://user-images.githubusercontent.com/39453835/138594199-900d43a7-b07a-4a83-b5cc-36cb2be8eb8b.png)

Log4j (•_•) Several Logger 
INFO	Interesting runtime events (startup/shutdown). Expect these to be immediately visible on a console, so be conservative and keep to a minimum.

### Defining Specifications

* This template includes a sample specification which opens up a browser and navigates to `Get Started` page of Gauge.
* Add more specifications on top of sample specification.

Read more about [Specifications](http://getgauge.io/documentation/user/current/specifications/README.html)

### Writing the implementations

This is where the java implementation of the steps would be implemented. Since this is a Selenium based project, the java implementation would invoke Selenium APIs as required.

_We recommend considering modelling your tests using the [Page Object](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) pattern, and the [Webdriver support](https://github.com/SeleniumHQ/selenium/wiki/PageFactory) for creating them._

- Note that every Gauge step implementation is annotated with a `Step` attribute that takes the Step text pattern as a parameter.
Read more about [Step implementations in Java](http://getgauge.io/documentation/user/current/test_code/java/java.html)

### Execution

* You can execute the specification as:

```
mvn test
```
