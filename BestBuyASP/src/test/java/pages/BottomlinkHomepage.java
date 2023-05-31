package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;


public class BottomlinkHomepage  extends Wrapper {
	
	@FindBy(linkText = "United States")
	WebElement us;

	public void clickingUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(linkText = "Accessable")
	WebElement accessable;

	public void scrollBottomLink() {
		waitForElement(accessable);
		jsScrollUpToElement(accessable);
	}

	@FindBy(linkText = "Top Deal")
	WebElement topDeal;

	public void scrollUp() {
		waitForElement(topDeal);
		jsScrollUpToElement(topDeal);
	}

	@FindBy(xpath = "//div[@class='flex justify-content-start']//a")
	List<WebElement> everyLink;

	public void gettingBottomLinks() {

		System.out.println("Total Links in Bottom :" + everyLink.size());
		for (WebElement link : everyLink) {

			String bottomLink = link.getAttribute("href");
			brokenLink(bottomLink);

		}
	}


}
