package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class DepartmentCartadd  extends Wrapper{
	
	@FindBy(linkText="United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(xpath="//button[text()='Menu']")
	WebElement menuAll;

	public void clickAllMenu() {
		waitForElement(menuAll);
		clickAction(menuAll);
	}

	@FindBy(xpath="//button[text()='Appliances']")
	WebElement appliance;

	public void clickAppliance() {
		waitForElement(appliance);
		clickAction(appliance);
	}

	@FindBy(xpath="//button[text()='Small Kitchen Appliances']")
	WebElement smallKitchen;

	public void clicksmallKitchen() {
		waitForElement(smallKitchen);
		clickAction(smallKitchen);
	}

	@FindBy(linkText="Bar & Wine")
	WebElement barandWine;

	public void clickbar_Wine() {
		waitForElement(barandWine);
		clickAction(barandWine);
	}

	//@FindBy(linkText="Epicureanist - Illuminati Red Wine Glasses (6-Pack) - Clear")
	//Cuisinart - Cordless Wine Opener with Vacuum Sealer - Black
	@FindBy(partialLinkText="Cuisinart - Cordless")
	WebElement cuisinart;

	public void clickCuisinart() {
		waitForElement(cuisinart);
		clickAction(cuisinart);
	}

	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addCart;

	public void clickAddToCart() {
		waitForElement(addCart);
		//clickAction(addToCart);
		//jsScrollUpToElement(addToCart);
		jsClick(addCart);
	}

	@FindBy(linkText="Go to Cart")
	WebElement goToCart;

	public void clickGoToCart() {
		waitForElement(goToCart);
		clickAction(goToCart);
	}

}
