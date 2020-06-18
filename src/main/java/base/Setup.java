package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Setup {


	// Webdriver instance for easy access
	public static AndroidDriver<MobileElement> driver;
	public static WebDriverWait wait;
	public static Properties properties;
	
	// Class constructor for initialising objects
	public Setup() throws FileNotFoundException, IOException {
		BufferedReader reader;
		try {
			String configFilePath = "./configs/Configuration.properties";
			reader = new BufferedReader(new FileReader(configFilePath));
			properties = new Properties();
			properties.load(reader);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			throw new RuntimeException("File Data.properties not found at given path.");
		} catch (IOException ioe) {
			ioe.printStackTrace();
			throw new RuntimeException("Issue on reading file.");
		}
	}

	/*
	 * Method details out configuration for installing app on android device
	 */
	public AndroidDriver<MobileElement> intallApp() {
		
		
		if (driver == null) {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			File appPath = new File(properties.getProperty("androidAamazonApp"));
			
	        appPath = new File(properties.getProperty("androidAamazonApp"));
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("androidPlatformName"));
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					properties.getProperty("androidPlatformVersion"));
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("androidDeviceName"));
			cap.setCapability(MobileCapabilityType.UDID, properties.getProperty("androidDeviceUDID"));
			cap.setCapability("appPackage", properties.getProperty("appPackage"));
			cap.setCapability("appActivity", properties.getProperty("appActivity"));
			
			cap.setCapability("session-override", "true");
			cap.setCapability("noResetValue", "false");
			cap.setCapability("autoGrantPermissions", true);
			cap.setCapability("autoAcceptAlerts", true);

			cap.setCapability("app", appPath.getAbsolutePath());
			System.out.println(appPath.getAbsolutePath());
			
			try {
				URL url = new URL("http://0.0.0.0:4723/wd/hub");
				driver = new AndroidDriver<MobileElement>(url, cap);
				driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
				System.out.println("Mobile application launched." + driver);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		}
		
		return driver;
	}

}
