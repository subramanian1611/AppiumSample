package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

public class HamburgerMenu extends Setup {

	public HamburgerMenu() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickHelloSignin() {
		
		helloSignIn().click();
	}
	
	public void enterMobileNumberOrEmail(String data) {
		
		mobileNumberOrEmail().click();
		mobileNumberOrEmail().clear();
		mobileNumberOrEmail().sendKeys(data);
	}
	
	public void clickContinueButton() {
		
		continueButton().click();
	}

	// Elements below utilised in by the methods above.
	private MobileElement helloSignIn() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/gno_greeting_text_view"))));
	}

	private MobileElement mobileNumberOrEmail() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.EditText[@index='1']"))));
	}

	private MobileElement continueButton() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Continue']"))));
	}
}
