package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Loginpage;
import utils.Wrapper;

public class LoginpageTest extends Wrapper {

	
	@Test(priority = 2)
	public void siginBestBuy() {

		

		launchBrowser("https://www.bestbuy.com");

		Loginpage lp = PageFactory.initElements(driver, Loginpage.class);

		lp.clickingUS();
		lp.clickAccount();
		lp.clickSigin();
		lp.typeEmail("carltonsuraj962@gmail.com");
		lp.typePassword("Two+Two=4");
		lp.clickSingin1();
		System.out.println("Login has  done successfully");
		closeBrowser();

	}
}
