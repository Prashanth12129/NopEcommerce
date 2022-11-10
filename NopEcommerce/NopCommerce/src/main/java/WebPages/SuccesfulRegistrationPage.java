package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.Generics;

public class SuccesfulRegistrationPage extends TestBase
{

	@FindBy(xpath = "//a[@class='ico-logout']")
	WebElement logout;

	@FindBy(xpath = "//div[text()='Your registration completed']")
	WebElement textSucessfullySignUp;
	
	public SuccesfulRegistrationPage(){

		PageFactory.initElements(driver, this);
	}
	
	
	public void selectLogout()
	{
		Generics.waitForElementAndSelect(logout);
	}
	
	
	
	public String getSucesfulSignUpString()
	{
		return this.textSucessfullySignUp.getText();
	}
}
