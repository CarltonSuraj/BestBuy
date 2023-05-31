package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class SearchAdd extends Wrapper{
	
	@FindBy(linkText="United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(name="st")
	WebElement searchUser;

	public void searchProduct(String user) {
		waitForElement(search0);
		typeText(searchUser, user);
	}

	@FindBy(xpath="//button[@title='submit search']")
	WebElement search0;

	public void clickSearch() {
		waitForElement(search0);
		clickAction(search0);
	}

	@FindBy(linkText="SanDisk - 256GB iXpand Flash Drive Luxe for iPhone Lightning and Type-C Devices - Black")
	WebElement csanDisk;

	public void clickSanDisk() {
		waitForElement(csanDisk);
		clickAction(csanDisk);
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
	WebElement goToCart;

	public void clickGoToCart() {
		waitForElement(goToCart);
		clickAction(goToCart);
	}


}
