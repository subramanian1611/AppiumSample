package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;

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
	private WebElement helloSignIn() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/gno_greeting_text_view"))));
	}

	private WebElement mobileNumberOrEmail() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.EditText[@index='1']"))));
	}

	private WebElement continueButton() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Continue']"))));
	}
}
