package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DepartmentCartadd;
import utils.Wrapper;

public class DepartmentCartaddTest extends Wrapper {
	
	
	@Test(priority = 6)
	public void departmentAddItem() {

	

		launchBrowser("https://www.bestbuy.com");

		DepartmentCartadd dsp = PageFactory.initElements(driver, DepartmentCartadd.class);

		dsp.clickingUS();

		dsp.clickAllMenu();

		dsp.clickAppliance();

		dsp.clicksmallKitchen();

		dsp.clickbar_Wine();

		dsp.clickCuisinart();

		dsp.clickAddToCart();

		dsp.clickGoToCart();

		screenShot("DepatAddCart");

		System.out.println(" Cuisinart vaccum sealer added to cart successfully");

		closeBrowser();

	}

}
