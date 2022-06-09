# PROJECT STRUCTURE
* This project developed with Java programming language.
* Selenium selected as UI automation tool.
* Maven is being used as build management tool.
* Preferred Cucumber as testing framework. You can see the related feature files under src/test/resources/features folder.
* pom.xml file is created by Maven. It is possible to manage required dependencies easily via this file.
* Under src/test/java/com/formedix folder, you can see the java codes here.
* Test data is stored at configuration.properties file. It is possible to change browser type and url.

# HOW TO EXECUTE TEST?

You should define proper tag on CukesRunner.class file to run tests automatically (@wip).

* Click Green Play icon on CukesRunner.class file and Run.
* It is also possible to execute tests on feature files with clicking green play icon.
* You can run test with maven (on the right side) and access fancy cucumber report in target folder(cucumber-html-reports).
* Pre and post test commands are stored at Hooks.class.
* Singleton Driver pattern applied.
* It is possible to perform tests on different browsers via updating required field at configuration.properties file.



### You will see small notes in the project to explain the methods. In case of questions, please don't hesitate to ask.

#### Developed by Erdem KARABEKMEZ erdemkarabekmez@gmail.com