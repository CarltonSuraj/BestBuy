package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;


public class BrandcartAdd extends Wrapper {
	
	@FindBy(linkText="United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(xpath="//button[text()='Menu']")
	WebElement allMenu;

	public void clickAllMenu() {
		waitForElement(allMenu);
		clickAction(allMenu);
	}

	@FindBy(xpath="//button[text()='Brands']")
	WebElement product;

	public void clickBrands() {
		waitForElement(product);
		clickAction(product);
	}

	@FindBy(linkText="Apple")
	WebElement apple;

	public void clickApple() {
		waitForElement(apple);
		clickAction(apple);
	}

	@FindBy(linkText="AirPod")
	WebElement airPod;

	public void clickAirPods() {
		waitForElement(airPod);
		clickAction(airPod);
	}

	@FindBy(linkText="AirPods Max")
	WebElement airPodMax;

	public void clickAirPodsMax() {
		waitForElement(airPodMax);
		clickAction(airPodMax);
	}

	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement addToCart;

	public void clickAddToCart() {
		waitForElement(addToCart);
		//clickAction(addToCart);
		jsScrollUpToElement(addToCart);
		jsClick(addToCart);
	}

	@FindBy(linkText="Go to Cart")
	WebElement gotoCart;

	public void clickGoToCart() {
		waitForElement(gotoCart);
		clickAction(gotoCart);
	}

}
