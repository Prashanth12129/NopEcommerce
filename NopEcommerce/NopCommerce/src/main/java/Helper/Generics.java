package Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;
import Global.Global;

public class Generics extends TestBase {



	public static void waitForTheElementAndSendInput(String input, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Global.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(input);
	}

	
	
	
	public static void waitForElementAndSelect(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Global.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
	
	public static boolean waitForTheElementAndVerifyISDisplayed(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Global.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
}
