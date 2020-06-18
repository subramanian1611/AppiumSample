/**
 * 
 */
package stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.model.Log;

import base.Setup;
import commonmethods.CommonUtilMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CartPage;
import pageobjects.HamburgerMenu;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ProductPage;
import pageobjects.SearchResultPage;

/**
 * @author nitinthite
 *
 */
public class AmazonTest extends Setup {

	HomePage homepage;
	ProductPage productpage;
	CartPage cartpage;
	HamburgerMenu menu;
	SearchResultPage searchresult;
	LoginPage loginpage;
	CommonUtilMethods commonutils;

	public AmazonTest() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Before
	@Given("^User lunches the Amazon app$")
	public void launch_the_Amazon_app() throws Throwable {
		Setup setup = new Setup();
		setup.intallApp();
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String Button) throws Throwable {

		homepage = new HomePage();

		if (Button.equals("Start shopping")) {
			try {

				homepage.skipSignin();

			} catch (Exception E) {
				System.out.println("Skip Sign in not Displayed Hence moving to HomePage");
			}

		} else if (Button.equals("hamburger")) {

			homepage.clickhamburgerMenu();

		} else if (Button.equals("Amazon")) {

			homepage.clickAmazonLogo();

		} else if (Button.equals("Proceed to Buy")) {

			cartpage = new CartPage();
			cartpage.clickProceedToBuy();
			cartpage.assertAddMobileNumber();
		}
	}

	@When("^Verify if \"([^\"]*)\" is displayed$")
	public void verify_is_displayed(String Page) throws Throwable {

		homepage = new HomePage();

		if (Page.equals("Home page")) {
//			homepage.assertHomePage();
		}
	}

	@When("^Login to amazon app$")
	public void login_to_amazon_app() throws Throwable {
		// To get the Current Orientation of the Device
		ScreenOrientation CurrentScreen = driver.getOrientation();
		System.out.println("The Oreintation of Current Page is : " + CurrentScreen);

		// To rotate the Current Orientation to LANDSCAPE
		driver.rotate(ScreenOrientation.LANDSCAPE);
		// To rotate the Current Orientation to PORTRAIT
		driver.rotate(ScreenOrientation.PORTRAIT);

		menu = new HamburgerMenu();
		menu.clickHelloSignin();
		menu.enterMobileNumberOrEmail("sdjnf@aknf.com");//properties.getProperty("email")
		menu.clickContinueButton();

		loginpage = new LoginPage();
		loginpage.enterPassword("sgtwetew");//properties.getProperty("password")
		loginpage.clickLogin();

		homepage = new HomePage();
		homepage.assertHomePage();
	}

	@When("^Validate text \"([^\"]*)\" is displayed$")
	public void validate_text_is_displayed(String Text) throws Throwable {

		homepage = new HomePage();

		if (Text.endsWith("Amazon Logo")) {

			homepage.assertHomePage();
		}
	}

	@When("^Validate \"([^\"]*)\" is displayed$")
	public void validate_is_displayed(String Options) throws Throwable {

		searchresult = new SearchResultPage();

		if (Options.equals("Search Bar")) {
			searchresult.assertSearchResultPage();
		} else if (Options.equals("65-inch TV")) {
			searchresult.assertResultCount();
		}
	}

	@When("^Verify the Suggestion on the Home Page$")
	public void verify_the_Suggestion_on_the_Home_Page() throws Throwable {

		commonutils = new CommonUtilMethods();
		// To Swipe the Current Card with the Given Co-Ordinates
		commonutils.swipeHorizontal(driver);
	}

	@When("^Choose the current location$")
	public void choose_the_current_location() throws Throwable {

		homepage = new HomePage();
		homepage.clickAmazonLogo();
		homepage.clickDeliverButton();
		homepage.clickUseCurrentLocation();

		productpage = new ProductPage();
		productpage.clickAllowPermissions();

	}

	@When("^Search for the product \"([^\"]*)\"$")
	public void search_for_the_product(String Product) throws Throwable {

		searchresult = new SearchResultPage();

		if (Product.equals("65-inch TV")) {
			searchresult.assertResultCount();
			searchresult.enterValuesForHomeSearch(Product);
			searchresult.clickDropdown();
			searchresult.assertResultCount();
		}
	}

	@When("^User selects the product from the list$")
	public void user_selects_the_product_from_the_list() throws Throwable {

		commonutils = new CommonUtilMethods();
		// Scrolling to the Requested Element by Text
		commonutils.scrollToText("Samsung", driver);//properties.getProperty("Brand")

		productpage = new ProductPage();
		productpage.assertRandomResult();
		productpage.assertInchesDisplayed();
	}

	@When("^Verify product details are displayed$")
	public void verify_product_details_are_displayed() throws Throwable {

		productpage = new ProductPage();
		System.out.println("The Selected Product is : " + productpage.getProductName());
		// Verify the Choosen Product is same as TV or not
		Assert.assertTrue("The suggestions are not having expected Product",
				productpage.getProductName().contains("tv"));//properties.getProperty("tv")
	}

	@When("^User Verifies the details of the selected Product$")
	public void user_Verifies_the_details_of_the_selected_Product() throws Throwable {

		productpage = new ProductPage();
		
		// To get the Name of ChoosenProduct
		String ProductDetailsPage = productpage.getProductName();
		
		// To verify the Choosen Product is same as TV or not
//		Assert.assertEquals(ProductDetailsPage, ProductName);
		System.out.println("The Name of the Choosen Product is :" + ProductDetailsPage);
		
		// To get the Price of Choosen Product
		String ProductPrice = productpage.getProductPrice();
		System.out.println("The Price of the Choosen Prodcut is: " + ProductPrice);
	}

	@When("^User Add's the product to the Cart$")
	public void user_Add_s_the_product_to_the_Cart() throws Throwable {

		commonutils = new CommonUtilMethods();
		// To add the Procut to Cart by Scrolling to Add Cart Section");
		Thread.sleep(4000);
		commonutils.scrollToText("Add to Cart", driver);
		
		productpage = new ProductPage();
		productpage.assertProductAddedToCart();
	}

	@Then("^User closes the app$")
	public void user_closes_the_app() throws Throwable {

		// Closing the App
		driver.closeApp();
	}

	@When("^Navigate to the Cart menu$")
	public void navigate_to_the_Cart_menu() throws Throwable {

		homepage = new HomePage();
		homepage.clickAmazonLogo();
		
		cartpage = new CartPage();
		cartpage.clickCartMenu();
	}

	@When("^Verify the Product in Cart$")
	public void verify_the_Product_in_Cart() throws Throwable {
		
		productpage = new ProductPage();
		String ProductCartPage = productpage.getProductName();
		
		// To verify the Expected Element is displayd on Current Page
		Assert.assertTrue("Product not displayed", productpage.getProductName().isEmpty());
		
		// To verify the Product is TV or not
		Assert.assertTrue("The product is not present in the Cart", ProductCartPage.contains("tv"));//properties.getProperty("tv")
	}
}