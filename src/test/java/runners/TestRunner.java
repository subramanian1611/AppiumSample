/**
 * 
 */
package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

/**
 * @author nitinthite
 * Entry Point for project execution
 */


/*
 * PLZ read "https://docs.cucumber.io/cucumber/api/#running-cucumber" for more
 * details on cucumber options
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},
features = "src/test/resources/features", 
tags = {"@AmazonTest"},
glue = "stepdefinitions", 
monochrome = true,
strict = false)

/*
 * The first point which triggers the automation suite selected
 */
public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		
	}
}
