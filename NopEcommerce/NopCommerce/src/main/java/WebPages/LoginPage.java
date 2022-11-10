package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.Generics;

public class LoginPage extends TestBase {

	

	@FindBy(id = "SubmitCreate")
	WebElement createSubmitBtn;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}


	public SignUpPage submitEmailBtn(){

		Generics.waitForElementAndSelect(createSubmitBtn);
		return new SignUpPage();
	}
}































