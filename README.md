# AppiumSample

Sample Appium project for Android native app automation

-*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*-

# Framework components:

1. Selenium WebDriver with Java
2. Maven
2. Cucumeber (BDD)
3. Junit

-*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*-

# Pre-requisites:

Need to provide device details in 'config.properties' that will run the suite over

-*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*-

# Execution from CMD

Clone the project from 'https://github.com/nitint007/AppiumSample' to your workspace

cd AppiumSample

mvn clean test

-*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*-

# Execution from Editor

1. Clone the GIT project to your local from 'https://github.com/nitint007/AppiumSample'
2. Import as 'Maven Project' in your editor
3. Right click on project root and do 'Maven > clean' and 'Maven > install'
4. Go to '/AppiumSample/src/test/java/runners/TestRunner.java' and open
5. Right click on file and do 'Run as' > 'Junit Test'
6. Wait until expected suite is executed and observe the results

-*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*-

# Reporting

Extent report can be found at '/AppiumSample/target/cucumber/report.html'

-*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*--*<*>*-
