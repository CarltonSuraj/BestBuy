package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.BottomlinkHomepage;
import utils.Wrapper;

public class BottomlinkHomepageTest extends Wrapper {

	

	@Test(priority = 4)
	public void scrollBottomLink() {

		try {
			

			launchBrowser("https://www.bestbuy.com");

			BottomlinkHomepage bp = PageFactory.initElements(driver, BottomlinkHomepage.class);

			bp.clickingUS();

			bp.scrollBottomLink();
			Thread.sleep(3000);

			bp.gettingBottomLinks();
			Thread.sleep(3000);

			bp.scrollUp();

			System.out.println("The Bottom link has been validated and printed successfully");

			closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
