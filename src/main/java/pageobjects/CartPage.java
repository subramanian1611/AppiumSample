package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

public class CartPage extends Setup {

	public CartPage() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void assertAddMobileNumber() {
		
		Assert.assertTrue("Expected Element is not Present",addMobileNumber().isDisplayed());
	}
	
	public void clickProceedToBuy() {
		
		proceedToBuy().click();
	}
	
	public void clickCartMenu() {
		
		cartMenu().click();
	}

	// Elements below utilised in by the methods above.
	private WebElement cartMenu() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/action_bar_cart_image"))));
	}

	private WebElement proceedToBuy() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Proceed to Buy']"))));
	}

	private WebElement subTotal() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.view.View[contains(@text,'Subtotal')]"))));
	}

	private WebElement clearSearch() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_clear"))));
	}

	private WebElement addMobileNumber() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.view.View[@text='Add a mobile phone number']"))));
	}

	private WebElement mobileNumberField() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.EditText[@index='1']"))));
	}

	private WebElement continueMoble() {
		return wait
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@text='Continue']"))));
	}

	private WebElement enterShippingAddress() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("android.view.View[@text='Enter a shipping address']"))));
	}

}
