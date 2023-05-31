package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;


public class SignupPage extends Wrapper{
	
	@FindBy(linkText="United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(xpath="//span[text()='Account']")
	WebElement ccaccount;

	public void clickAccount() {
		waitForElement(ccaccount);
		clickAction(ccaccount);
	}

	@FindBy(linkText="Create Account")
	WebElement creAccount;

	public void clickCreateAccount() {
		waitForElement(creAccount);
		clickAction(creAccount);
	}

	@FindBy(id="firstName")
	WebElement firname;

	public void setFirstName(String user) {
		waitForElement(firname);
		typeText(firname, user);
	}

	@FindBy(id="lastName")
	WebElement lastname;

	public void setLastName(String user) {
		waitForElement(lastname);
		typeText(lastname, user);
	}

	@FindBy(id="email")
	WebElement email;

	public void setEmail(String user) {
		waitForElement(email);
		typeText(email, user);
	}

	@FindBy(id="fld-p1")
	WebElement password;

	public void setPassword(String user) {
		waitForElement(password);
		typeText(password, user);
	}

	@FindBy(id="reenterPassword")
	WebElement reentPassword;

	public void setRePassword(String user) {
		waitForElement(reentPassword);
		typeText(reentPassword, user);
	}

	@FindBy(id="phone")
	WebElement phnumber;

	public void setPhoneNumber(String user) {
		waitForElement(phnumber);
		typeText(phnumber, user);
	}

	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createAccount0;

	public void clickCreateAccount1() {
		waitForElement(createAccount0);
		clickAction(createAccount0);
	}
	
	
	

}
