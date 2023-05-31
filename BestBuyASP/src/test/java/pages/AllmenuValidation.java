package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;




public class AllmenuValidation extends Wrapper {
	
	@FindBy(linkText = "United States")
	WebElement us;

	public void clickUS() {
		waitForElement(us);
		clickAction(us);
	}

	@FindBy(linkText = "Top Deals")
	WebElement topDeals;

	public void clickDeal(String expectedTitle) {
		waitForElement(topDeals);
		clickAction(topDeals);
		validateTitle(expectedTitle);
		System.out.println("Top Deal Validation successfull");
	}

	@FindBy(linkText = "Deal of the Day")
	WebElement dealofTheDay;

	public void clickDealDay(String expectedTitle) {
		waitForElement(dealofTheDay);
		clickAction(dealofTheDay);
		validateTitle(expectedTitle);
		System.out.println("Deal of the Day Validation successfull");
	}

	@FindBy(linkText = "Totaltech Membership")
	WebElement totalTechMembership;

	public void clickTotalMembership(String expectedTitle) {
		waitForElement(totalTechMembership);
		clickAction(totalTechMembership);
		validateTitle(expectedTitle);
		System.out.println("TotalTech Validation successfull");
	}

	@FindBy(linkText = "Credit Cards")
	WebElement creditCard;

	public void clickCreditCards(String expectedTitle) {
		waitForElement(creditCard);
		clickAction(creditCard);
		validateTitle(expectedTitle);
		System.out.println("Credit Cards Validation successfull");
	}

	@FindBy(linkText = "Gift Card")
	WebElement giftCard;

	public void clickGiftCards(String expectedTitle) {
		waitForElement(giftCard);
		clickAction(giftCard);
		validateTitle(expectedTitle);
		System.out.println("Gift Cards Validation successfull");
	}

	@FindBy(xpath="//span[text()='More']")
	WebElement more;

	public void clickMore() {
		waitForElement(more);
		clickAction(more);
	}

	@FindBy(linkText = "Gift Idea")
	WebElement giftIdeas;

	public void clickIdeaGift(String expectedTitle) {
		waitForElement(giftIdeas);
		clickAction(giftIdeas);
		validateTitle(expectedTitle);
		System.out.println("Gift Ideas Validation successfull");
	}

	@FindBy(linkText = "Wellness and Health")
	WebElement health;

	public void clickWellnessAndHealth(String expectedTitle) {
		waitForElement(health);
		clickAction(health);
		validateTitle(expectedTitle);
		System.out.println("Wellness and Health Validation successfull");
	}

	@FindBy(linkText = "Best Buy Outlet")
	WebElement bestbuyOutlet;

	public void clickBestBuyOutlet(String expectedTitle) {
		waitForElement(bestbuyOutlet);
		clickAction(bestbuyOutlet);
		validateTitle(expectedTitle);
		System.out.println("Best Buy Outlet Validation successfull");
	}

	@FindBy(linkText = "Best Buy Business")
	WebElement bestbuyBusiness;

	public void clickBBBusiness(String expectedTitle) {
		waitForElement(bestbuyBusiness);
		clickAction(bestbuyBusiness);
		validateTitle(expectedTitle);
		System.out.println("Best Buy Business Validation successfull");
	}

	

}
