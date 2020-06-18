package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

public class HomeScreen extends Setup {

	public HomeScreen() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void assertHomePage() {

		Assert.assertTrue(amazonLogo().isDisplayed());
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
	private MobileElement amazonLogo() {
		return (MobileElement) driver.findElement(By.id("com.amazon.mShop.android.shopping:id/action_bar_home_logo"));
	}

	private MobileElement hamburgerMenu() {
		return (MobileElement) driver.findElement(By.id("com.amazon.mShop.android.shopping:id/action_bar_burger_icon"));
	}

	private MobileElement startShopping() {
		return (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Start shopping']"));
	}

	private MobileElement clearButton() {
		return (MobileElement) driver
				.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_clear_text_button_accessibility"));
	}

	private MobileElement deliver() {
		return (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Deliver')]"));
	}

	private MobileElement useCurrentLocation() {
		return (MobileElement) driver
				.findElement(By.id("com.amazon.mShop.android.shopping:id/loc_ux_update_current_pin_code"));
	}

	private MobileElement signinForBestExperience() {
		return (MobileElement) driver.findElement(By.xpath("//*[@text='Sign in for the best experience']"));
	}

}
