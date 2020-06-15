/**
 * 
 */
package stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import base.Setup;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author nitinthite
 *
 */
public class AmazonTest extends Setup {

	public AmazonTest() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void beforeSteps() throws FileNotFoundException, IOException {
		Setup setup = new Setup();
		setup.intallApp();
	}
	
	@Given("^User lunches the Amazon app$")
	public void launch_the_Amazon_app() throws Throwable {
	    
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String arg1) throws Throwable {
	   
	}

	@When("^Verify if \"([^\"]*)\" is displayed$")
	public void verify_is_displayed(String arg1) throws Throwable {
	   
	}

	@When("^Login to amazon app$")
	public void login_to_amazon_app() throws Throwable {
	    
	}

	@When("^Validate text \"([^\"]*)\" is displayed$")
	public void validate_text_is_displayed(String arg1) throws Throwable {
	    
	}

	@When("^Validate \"([^\"]*)\" is displayed$")
	public void validate_is_displayed(String arg1) throws Throwable {
	    
	}

	@When("^Verify the Suggestion on the Home Page$")
	public void verify_the_Suggestion_on_the_Home_Page() throws Throwable {
	   
	}

	@When("^Choose the current location$")
	public void choose_the_current_location() throws Throwable {
	    
	}

	@When("^Search for the product \"([^\"]*)\"$")
	public void search_for_the_product(String arg1) throws Throwable {
	   
	}

	@When("^User selects the product from the list$")
	public void user_selects_the_product_from_the_list() throws Throwable {
	    
	}

	@When("^Verify product details are displayed$")
	public void verify_product_details_are_displayed() throws Throwable {
	    
	}

	@When("^User Verifies the details of the selected Product$")
	public void user_Verifies_the_details_of_the_selected_Product() throws Throwable {
	   
	}

	@When("^User Add's the product to the Cart$")
	public void user_Add_s_the_product_to_the_Cart() throws Throwable {
	    
	}

	@Then("^User closes the app$")
	public void user_closes_the_app() throws Throwable {
	    
	}

	@When("^Navigate to the Cart menu$")
	public void navigate_to_the_Cart_menu() throws Throwable {
	   
	}

	@When("^Verify the Product in Cart$")
	public void verify_the_Product_in_Cart() throws Throwable {
	    
	}

}
