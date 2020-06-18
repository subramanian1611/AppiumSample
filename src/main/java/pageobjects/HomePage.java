package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;

public class HomePage extends Setup {

	public HomePage() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void assertHomePage() {
		
		Assert.assertTrue(amazonLogo().isDisplayed());
	}

	public void skipSignin() {

		skipSignInButton().click();

	}

	public void clickhamburgerMenu() {

		hamburgerMenu().click();
	}
	
	public void clickAmazonLogo() {

		amazonLogo().click();
	}
	
	public void clickDeliverButton() {

		deliver().click();
	}
	
	public void clickUseCurrentLocation() {

		useCurrentLocation().click();
	}

	// Elements below utilised in by the methods above.
	private WebElement skipSignInButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"))));
	}

	private WebElement amazonLogo() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/action_bar_home_logo"))));
	}

	private WebElement hamburgerMenu() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/action_bar_burger_icon"))));
	}

	private WebElement startShopping() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.widget.TextView[@text='Start shopping']"))));
	}

	private WebElement clearButton() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_clear_text_button_accessibility"))));
	}

	private WebElement deliver() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Deliver')]"))));
	}

	private WebElement useCurrentLocation() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/loc_ux_update_current_pin_code"))));
	}

	private WebElement signinForBestExperience() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//*[@text='Sign in for the best experience']"))));
	}

}
