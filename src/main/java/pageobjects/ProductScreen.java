package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

public class ProductScreen extends Setup {

	public ProductScreen() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickAllowPermissions() {

		allowPermission().click();
	}
	
	public void assertRandomResult() {
		
		Assert.assertTrue("Randome result element Not Displayed",randomResult().isDisplayed());
	}
	
	public void assertInchesDisplayed() {
		
		Assert.assertTrue("Inches not displayed", inches().isDisplayed());
	}
	
	public String getProductName() {
		
		Assert.assertTrue("Product not displayed", prodcutName().isDisplayed());
		return prodcutName().getText();
	}
	
	public String getProductPrice() {
		
		return price().getText();
	}
	
	public void assertProductAddedToCart() {
		
		Assert.assertTrue("Issue tracing element.",addedToCart().isDisplayed());
	}

	// Elements below utilised in by the methods above.
	private MobileElement randomResult() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']"))));
	}

	private MobileElement name() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//*[@resource-id='title_feature_div']"))));
	}

	private MobileElement useMyCurrentLocarion() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/loc_ux_gps_auto_detect"))));
	}

	private MobileElement allowPermission() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"))));
	}

	private MobileElement price() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//*[@resource-id='atfRedesign_priceblock_priceToPay']"))));
	}

	private MobileElement inches() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/glow_subnav_label"))));
	}

	private MobileElement prodcutName() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//*[@resource-id='title_feature_div']"))));
	}

	private MobileElement prodcutDetails() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.view.View[@text='FREE Delivery']"))));
	}

	private MobileElement fromTheManufacturer() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.view.View[@text='From the manufacturer']"))));
	}

	private MobileElement addToCart() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//*[@resource-id='add-to-cart-button']"))));
	}

	private MobileElement addedToCart() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.id("com.amazon.mShop.android.shopping:id/atc-success"))));
	}
}
