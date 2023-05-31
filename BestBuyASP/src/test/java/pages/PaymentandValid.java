package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class PaymentandValid extends Wrapper {
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;

	public void clickCheckout() {
		waitForElement(checkout);
		clickAction(checkout);
	}

	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement cGuest;

	public void clickGuestButton() {
		waitForElement(cGuest);
		clickAction(cGuest);
	}

	@FindBy(id="user.emailAddress")
	WebElement enterEmailUser;

	public void enterEmail(String user) {
		waitForElement(enterEmailUser);
		typeText(enterEmailUser, user);
	}

	@FindBy(id="user.phone")
	WebElement enterNumberUser;

	public void enterNumber(String user) {
		waitForElement(enterNumberUser);
		typeText(enterNumberUser, user);
	}

	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continuePaymentInfo;

	public void clickContinuePayment() {
		waitForElement(continuePaymentInfo);
		jsScrollUpToElement(continuePaymentInfo);
		clickAction(continuePaymentInfo);
	}

	@FindBy(id="number")
	WebElement cardNumberUser;

	public void enterCardNumber(String user) {
		waitForElement(cardNumberUser);
		typeText(cardNumberUser, user);
	}

	@FindBy(id="first-name")
	WebElement fnameUser;

	public void enterFirstName(String user) {
		waitForElement(fnameUser);
		typeText(fnameUser, user);
	}

	@FindBy(id="last-name")
	WebElement lnameUser;

	public void enterLastName(String user) {
		waitForElement(lnameUser);
		typeText(lnameUser, user);
	}

	@FindBy(name="addressLine1")
	WebElement addressUser;

	public void enterAddress(String user) {
		waitForElement(addressUser);
		typeText(addressUser, user);
	}

	@FindBy(name="city")
	WebElement city;

	public void enterCity(String user) {
		waitForElement(city);
		typeText(city, user);
	}

	@FindBy(id="state")
	WebElement state;

	public void selectState(String user) {
		waitForElement(state);
		selectDDByVisibleText(state, user);
	}

	@FindBy(name="postalCode")
	WebElement postalCode;

	public void enterPostalCode(String user) {
		waitForElement(postalCode);
		typeText(postalCode, user);
	}

	@FindBy(xpath="//span[text()='Place Your Order']")
	WebElement placeYOrder;

	public void clickPlaceOrder() {
		waitForElement(placeYOrder);
		clickAction(placeYOrder);
	}

}
