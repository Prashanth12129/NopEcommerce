package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.Generics;

public class LandingPage extends TestBase
{



	@FindBy(xpath="//a[@class='login']")
	WebElement loginBtn;

	@FindBy(xpath = "//img[@alt='nopCommerce demo store']")
	WebElement logo;

	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement btnSignUp;

	public LandingPage(){

		PageFactory.initElements(driver, this);
	}


	public String getTitle(){
	
		String title = driver.getTitle();
		return title;
	}

	public LoginPage selectLoginBtn(){
		
		Generics.waitForElementAndSelect(loginBtn);
		return new LoginPage();
	}


	public boolean isLogoExist(){
		
		return this.logo.isDisplayed();
	}


	public boolean isSignUpExist(){
		
		 return this.btnSignUp.isDisplayed();
	}



	public SignUpPage selectSignUp(){
		
		Generics.waitForElementAndSelect(btnSignUp);
		return new SignUpPage();
	}
}
