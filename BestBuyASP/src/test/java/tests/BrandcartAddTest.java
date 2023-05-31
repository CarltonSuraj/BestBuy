package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BrandcartAdd;
import utils.Wrapper;

public class BrandcartAddTest extends Wrapper {
	
	@Test(priority = 7)
	public void brandAddToCart() {

		try {
			

			launchBrowser("https://www.bestbuy.com");

			BrandcartAdd bp = PageFactory.initElements(driver, BrandcartAdd.class);

			bp.clickingUS();
			bp.clickAllMenu();
			bp.clickBrands();
			bp.clickApple();
			bp.clickAirPods();
			bp.clickAirPodsMax();
			bp.clickAddToCart();
			bp.clickGoToCart();
			screenShot("BrandAddCart");
			System.out.println("Apple Airpod added to cart successfully");

			closeBrowser();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
