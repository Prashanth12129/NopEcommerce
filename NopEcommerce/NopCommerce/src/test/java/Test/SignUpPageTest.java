package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Global.Global;
import Utils.Utility;
import WebPages.LandingPage;
import WebPages.SignUpPage;
import WebPages.SuccesfulRegistrationPage;





public class SignUpPageTest extends TestBase
{
	LandingPage lnding ;
	SignUpPage register;

	@BeforeMethod
	public void setUp() throws Exception
	{
		TestBase test = new TestBase();
		test.createBrowserInstance();
		lnding = new LandingPage();
		
	}


	@DataProvider 
	public Object[][] getInfo()
	{
		Object[][] Info= Utility.getTestData(Global.EXEL_FILE_PATH);
		return Info;
	}	
	
	
	@Test(priority = 1, dataProvider = "getInfo")
	public void enterSignUpInfoAndVerifySignUpSucessful(String fName, String nName, String Enail, String Paswrd, String ConfirmPaswrd) throws Exception
	{

		lnding.selectSignUp();
		register = new SignUpPage();
		register.enterSignUpInfo(fName, nName, Enail, Paswrd, ConfirmPaswrd);
		register.selectSignUp();
		
		
		SuccesfulRegistrationPage registered =  new SuccesfulRegistrationPage();
		String sucessfulSignUp = registered.getSucesfulSignUpString();
		Assert.assertEquals(sucessfulSignUp, Global.EXPECTED_TITLE, "Expected title Not Matching"
				);
	}


	@AfterMethod 
	public void exitBrowser()
	{

		driver.quit();
	}

}
