package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

public class LoginScreen extends Setup {

	public LoginScreen() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void enterPassword(String pwd) {
		
		password().click();
		password().clear();
		password().sendKeys(pwd);
	}
	
	public void clickLogin() {
		
		login().click();
	}

	// Elements below utilised in by the methods above.
	private MobileElement signIn() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("gw-sign-in-button"))));
	}

	private MobileElement password() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.widget.EditText[@text='Amazon password']"))));
	}

	private MobileElement login() {
		return (MobileElement) wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Login']"))));
	}
}
