package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BrandcartAdd;
import pages.DepartmentCartadd;
import pages.PaymentandValid;
import pages.SearchAdd;
import utils.Wrapper;

public class PaymentandValidTest extends Wrapper{
	
	@Test(priority = 8)
	public void dummyPayments() {

		try {
		

			launchBrowser("https://www.bestbuy.com");

			SearchAdd sap = PageFactory.initElements(driver, SearchAdd.class);
			sap.clickingUS();
			sap.searchProduct("pendrives");
			sap.clickSearch();
			sap.clickSanDisk();
			sap.clickAddToCart();
			sap.clickGoToCart();

			BrandcartAdd bp = PageFactory.initElements(driver, BrandcartAdd.class);
			bp.clickAllMenu();
			bp.clickBrands();
			bp.clickApple();
			bp.clickAirPods();
			bp.clickAirPodsMax();
			bp.clickAddToCart();
			bp.clickGoToCart();
			Thread.sleep(5000);

			DepartmentCartadd dsp = PageFactory.initElements(driver, DepartmentCartadd.class);
			dsp.clickAllMenu();
			dsp.clickAppliance();
			dsp.clicksmallKitchen();
			dsp.clickbar_Wine();
			dsp.clickCuisinart();
			dsp.clickAddToCart();
			dsp.clickGoToCart();
			Thread.sleep(5000);
			screenShot("3AddCart");

			PaymentandValid pv = PageFactory.initElements(driver, PaymentandValid.class);
			pv.clickCheckout();
			pv.clickGuestButton();
			pv.enterEmail("carltonsuraj962@gmail.com");
			pv.enterNumber("9790642157");
			pv.clickContinuePayment();
			screenShot("errorInPayent");

	
			System.out.println("Payment button has  clicked successfully");
			System.out.println("There was problem in this stage in website so we can't verify that the order was placed successfully");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
