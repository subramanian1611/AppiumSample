/**
 * 
 */
package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

/**
 * @author nitinthite
 *
 */
public class SplashScreen extends Setup{

	public SplashScreen() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void assertSplashScreen() throws InterruptedException {
		
		Thread.sleep(5000);
		try {
			System.out.println("ON Splash screen");
			Assert.assertTrue("Issue accessing splash screen", skipSignInButton().isDisplayed());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void skipSignin() {
		
		try {
			
			skipSignInButton().click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	// Elements below utilised in by the methods above.
	private MobileElement appLogo() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/sso_splash_logo"))));
	}
	
	private MobileElement skipSignInButton() {
		return (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"))));
	}

}
