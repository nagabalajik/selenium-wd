## Setup and Run

Step-1: Install Maven on your local https://maven.apache.org/install.html  
Step-2: Install Java

Chromedriver executables for both mac and windows are at the root directory, so just change the property in the test class
```System.setProperty("webdriver.chrome.driver", "chromedriver_mac");```

This project uses TestNG:
TestNG config is here ```/src/main/resources/***.xml```
Maven config is here ```pom.xml```

If maven is installed on your local, then:  
To install dependencies:
```mvn clean install```  
To run tests:
```mvn test```

