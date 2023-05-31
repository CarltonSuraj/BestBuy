package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SearchAdd;
import utils.Wrapper;

public class SearchaddTest extends Wrapper{
	
	@Test(priority = 5)
	public void searchAddPendrive() {

		

		launchBrowser("https://www.bestbuy.com");

		SearchAdd sap = PageFactory.initElements(driver, SearchAdd.class);

		sap.clickingUS();

		sap.searchProduct("pendrives");

		sap.clickSearch();

		sap.clickSanDisk();

		sap.clickAddToCart();

		sap.clickGoToCart();

		screenShot("SearchAddCart");

		System.out.println("The SanDisk pendrive added to cart successfully");

		closeBrowser();
	}

}
