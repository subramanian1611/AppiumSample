package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Setup;
import io.appium.java_client.MobileElement;

public class CartScreen extends Setup {

	public CartScreen() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void assertAddMobileNumber() {

		Assert.assertTrue("Expected Element is not Present", addMobileNumber().isDisplayed());
	}

	public void clickProceedToBuy() {

		proceedToBuy().click();
	}

	public void clickCartMenu() {

		cartMenu().click();
	}

	// Elements below utilised in by the methods above.
	private MobileElement cartMenu() {
		return (MobileElement) driver.findElement(By.id("com.amazon.mShop.android.shopping:id/action_bar_cart_image"));
	}

	private MobileElement proceedToBuy() {
		return (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='Proceed to Buy']"));
	}

	private MobileElement subTotal() {
		return (MobileElement) driver.findElement(By.xpath("//android.view.View[contains(@text,'Subtotal')]"));
	}

	private MobileElement clearSearch() {
		return (MobileElement) driver
				.findElement(By.id("com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_clear"));
	}

	private MobileElement addMobileNumber() {
		return (MobileElement) driver.findElement(By.xpath("//android.view.View[@text='Add a mobile phone number']"));
	}

	private MobileElement mobileNumberField() {
		return (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
	}

	private MobileElement continueMoble() {
		return (MobileElement) driver.findElement(By.xpath("//*[@text='Continue']"));
	}

	private MobileElement enterShippingAddress() {
		return (MobileElement) driver.findElement(By.id("android.view.View[@text='Enter a shipping address']"));
	}

}
