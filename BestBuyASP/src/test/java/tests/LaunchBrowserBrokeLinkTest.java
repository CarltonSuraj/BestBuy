package tests;

import org.testng.annotations.Test;

import utils.Wrapper;

public class LaunchBrowserBrokeLinkTest extends Wrapper{
	
	@Test(priority = 0)
	public void findBrokenlinkOrNot() {

		try {
			
			launchBrowser("https://www.bestbuy.com");
			brokenLink("https://www.bestbuy.com");
			System.out.println("The Bestbuy ecom website navigated and validate the url is broken or not successfully");

			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
