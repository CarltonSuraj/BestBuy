package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.SignupPage;
import utils.Wrapper;

public class SignupTest extends Wrapper {
	
	@Test(priority = 1)
	public void signupBestBuy() {
		

		launchBrowser("https://www.bestbuy.com");
		SignupPage sp = PageFactory.initElements(driver, SignupPage.class);

		sp.clickingUS();
		sp.clickAccount();
		sp.clickCreateAccount();
		sp.setFirstName("Carlton");
		sp.setLastName("Suraj");
		sp.setEmail("carltonsuraj962@gmail.com");
		sp.setPassword("Two+Two=4");
		sp.setRePassword("one+four=5");
		sp.setPhoneNumber("9790642157");
		sp.clickCreateAccount1();
		System.out.println("Signup has been done suessfully");
		closeBrowser();

	}

}
