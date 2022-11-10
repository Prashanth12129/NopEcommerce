package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.Generics;

public class SignUpPage extends TestBase{


	@FindBy(xpath = "//h1[text()='Register']")
	WebElement textSignUp;

	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement fname;

	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lname;

	@FindBy(xpath = "//input[@name='Email']")
	WebElement fieldEmail;

	@FindBy(id = "Password")
	WebElement Password;

	@FindBy(id = "ConfirmPassword")
	WebElement reEnter;


	@FindBy(xpath = "//button[@name=\"register-button\"]")
	WebElement btnSignUp;


	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}



	public void enterSignUpInfo(String fName, String lName, String Email, String Paswrd, String ConfrimPasword ){

		Generics.waitForTheElementAndSendInput(fName,fname);
		Generics.waitForTheElementAndSendInput(lName, lname);
		Generics.waitForTheElementAndSendInput(Email, fieldEmail);
		Generics.waitForTheElementAndSendInput(Paswrd, Password);
		Generics.waitForTheElementAndSendInput(ConfrimPasword, reEnter);
	}



	public void selectSignUp()
	{
		Generics.waitForElementAndSelect(btnSignUp);
	}

}






