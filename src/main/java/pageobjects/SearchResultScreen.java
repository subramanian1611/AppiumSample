package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;
import io.appium.java_client.MobileElement;

public class SearchResultScreen extends Setup {

	public SearchResultScreen() throws FileNotFoundException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void assertSearchResultPage() {

		Assert.assertTrue("Search Result Page not displayed", homeSearch().isDisplayed());
	}

	public void assertResultCount() {

		Assert.assertTrue("Search Result Count not displayed", resultsCount().isDisplayed());
	}

	public void enterValuesForHomeSearch(String searchData) {

		Assert.assertTrue("Home search element not displayed", homeSearch().isDisplayed());
		homeSearch().click();
		homeSearch().clear();
		homeSearch().sendKeys(searchData);
	}

	public void clickDropdown() {

		searchDropDown().click();
	}

	// Elements below utilised in by the methods above.
	private MobileElement homeSearch() {
		return (MobileElement) driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
	}

	private MobileElement searchDropDown() {
		return (MobileElement) driver
				.findElement(By.id("com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text"));
	}

	private MobileElement resultsCount() {
		return (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Results')]"));
	}
}
