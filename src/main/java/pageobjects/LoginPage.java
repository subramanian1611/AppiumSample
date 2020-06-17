package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;

public class LoginPage extends Setup {

	public LoginPage() throws FileNotFoundException, IOException {
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
	private WebElement signIn() {
		return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("gw-sign-in-button"))));
	}

	private WebElement password() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.widget.EditText[@text='Amazon password']"))));
	}

	private WebElement login() {
		return wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//android.widget.Button[@text='Login']"))));
	}
}
