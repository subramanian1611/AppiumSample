/**
 * 
 */
package testutil;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;

import base.Setup;
import cucumber.api.Scenario;
import cucumber.api.java.Before;

/**
 * @author nitinthite
 *
 */
public class Hooks extends Setup {

	public Hooks() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	// ************** Cucumber Hooks @Before - to execute a suite precondition
//	// **************
//
//	@Before
//	public void beforeAllScenarios(Scenario s) {
//		System.out.println("Inside Hooks @Before");
//		intallApp();
//	}

	// ************** Junit Hook @After - to execute a common closure code
	// **************

	@AfterClass
	public void closeDriverInstance() {

		// To close the app
		driver.closeApp();
		
		// To close webdriver session
		driver.quit();
	}

}
