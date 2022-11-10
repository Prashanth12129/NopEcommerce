package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Global.Global;
import WebPages.LandingPage;

public class landingPagetest extends TestBase
{


	LandingPage lnding ;


	@BeforeMethod
	public void setUp() throws Exception
	{
		TestBase test = new TestBase();
		test.createBrowserInstance();
		lnding = new LandingPage();
	}

	@Test(priority = 1)
	public void verifyTheTitle()
	{
		String title = lnding.getTitle();
		Assert.assertEquals(title, Global.LOGIN_PAGE_TITLE,"Expected title is not matching");
	}


	@Test(priority = 2)
	public void verifyLogoExist()
	{
		boolean isExist = lnding.isLogoExist();
		Assert.assertTrue(isExist,"logo not exist");
	}



	@Test(priority = 3)
	public void verifyIsSignUpBtnExist()
	{

		boolean isExist = lnding.isSignUpExist();
		Assert.assertTrue(isExist,"Sign Up Btn not exist");
	}


	@AfterMethod 
	public void exitBrowser()
	{

		driver.quit();
	}







}
