# Testing JUnit Example
This project contains a simple Java application to represent a Contact manager. The Contact manager has a command line interface and has some data classes that hold the data. 

The purpose of the application is to illustrate some issues related to using JUnit to write test cases. 

# building the application
Maven is used to to build the application. The build file is in `pom.xml`. 

To run the tests, type `mvn test`. 

To run the code, type `mvn package`. This will create a runnable Jar file in the generated `target` directory. 

# packages 
The application contains the following packages. 

## main classes in software.testing.contactmanager 
This contains the classes in the application. Located in the `src/main` folder.

* Address 
* Contact
* ContactManager
* ContactManagerApplication
* CountryCode - An enumeration with values to represent a country.

## test classes in software.testing.contactmanager
The tests classes are in this package, within the `src/test` folder.

* AddressTest 
* ContactTest
* ContactManagerTest
* CountryCodeTest

# Building the Project
You can load this into your preferred IDE and run it. Use the facilities in your IDE 
to run the test phases. 

Instead of running this through the IDE, you can also run the tests from the 
command line using Maven. In the same folder as the `pom.xml` file, you can type `mvn test`. 
That will build the project and then run the tests. 

To run from the command line, you will need to download [Maven](http://maven.apache.org) 
and setup the path so that you can run the `mvn` command.


# Exercise 
Look at the TODO comments in `Contact` and `ContactManager`. 
Follow the instructions for those TODO items. 

