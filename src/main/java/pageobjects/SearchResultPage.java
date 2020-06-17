package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Setup;

public class SearchResultPage extends Setup {

	public SearchResultPage() throws FileNotFoundException, IOException {
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
		
		Assert.assertTrue("Home search element not displayed",homeSearch().isDisplayed());
		homeSearch().click();
		homeSearch().clear();
		homeSearch().sendKeys(searchData);
	}
	
	public void clickDropdown() {
		
		searchDropDown().click();
	}

	// Elements below utilised in by the methods above.
	private WebElement homeSearch() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"))));
	}

	private WebElement searchDropDown() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.id("com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text"))));
	}

	private WebElement resultsCount() {
		return wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Results')]"))));
	}
}
