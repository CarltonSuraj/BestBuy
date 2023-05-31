package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AllmenuValidation;
import utils.Wrapper;

public class AllmenuValidationTest extends Wrapper {
	
	

	@Test(priority = 3)
	public void validateTitle() {

		try {
			

			launchBrowser("https://www.bestbuy.com");

			AllmenuValidation ap = PageFactory.initElements(driver, AllmenuValidation.class);
			ap.clickUS();
			ap.clickDeal("Top Deals and Featured Offers on Electronic - Best Buy");
			Thread.sleep(3000);
			ap.clickDeal("Deal of the Day: Electronics Deal - Best Buy");
			Thread.sleep(3000);
			ap.clickTotalMembership("Best Buy Totaltech™ – Best Buy");
			Thread.sleep(3000);
			ap.clickCreditCards("Best Buy Credit Card: Rewards & Financing");
			Thread.sleep(3000);
			ap.clickGiftCards("Gifts Cards and E-Gift Card - Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickGiftCards("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickWellnessAndHealth("Health & Wellness Solutions & Technology - Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickBestBuyOutlet("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
			Thread.sleep(3000);
			ap.clickMore();
			ap.clickBBBusiness("Best Buy for Business - Best Buy");
			Thread.sleep(3000);

			System.out.println("All menu titles verified");
			closeBrowser();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
