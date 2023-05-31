package utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapper {
	
	public static WebDriver driver = null;

	public void launchBrowser(String url) {

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			
		} catch (Exception ex) {
			System.out.println("Problem while launching Browser");
			
			ex.printStackTrace();
		}
	}

	public void brokenLink(String url) {

		try {
			HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
			httpConnection.connect();
			int respCode = httpConnection.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is broken and its responsecode is " + respCode);
				
			} else {
				System.out.println(url + " is Valid and its responsecode is " + respCode);
				
			}
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void quitBrowser() {
		try {
			driver.quit();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void validateTitle(String expectedTitle) {

		try {
			Assert.assertEquals(driver.getTitle(), expectedTitle);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void typeText(WebElement ele, String text) {
		try {
			ele.clear();
			ele.sendKeys(text);
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void clickAction(WebElement ele) {
		try {
			ele.click();
			
		} catch (Exception ex) {
					ex.printStackTrace();
		}
	}

	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void waitForElement(WebElement ele, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void selectDDByValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void selectDDByIndex(WebElement ele, int index) {
		try {
			Select sel = new Select(ele);
			sel.selectByIndex(index);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

	public void selectDDByVisibleText(WebElement ele, String VisibleText) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(VisibleText);
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	
	public void jsScrollUpAndDown(int value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + value + ")");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void jsScrollUpToElement(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void jsClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	// screenshot
	public void screenShot(String nameBB) {
		try {
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("./screenShotBB/" + nameBB + ".png");

			FileUtils.copyFile(source, dest);

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
