package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class Loginpage extends Wrapper {
	
	@FindBy(linkText="United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(xpath="//span[text()='Account']")
	WebElement account;

	public void clickAccount() {
		waitForElement(account);
		clickAction(account);
	}

	@FindBy(linkText="Sign In")
	WebElement singin;

	public void clickSigin() {
		waitForElement(singin);
		clickAction(singin);
	}

	@FindBy(id="fld-e")
	WebElement emailUser;

	public void typeEmail(String user) {
		waitForElement(emailUser);
		typeText(emailUser, user);
	}

	@FindBy(id="fld-p1")
	WebElement passwordUser;

	public void typePassword(String user) {
		waitForElement(passwordUser);
		typeText(passwordUser, user);
	}

	@FindBy(xpath="//button[text()='Sign In']")
	WebElement singin5;

	public void clickSingin1() {
		waitForElement(singin5);
		clickAction(singin5);
	}

}
