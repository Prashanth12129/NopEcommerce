package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import FetchFileProperties.FetchProperties;
import Global.Global;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {


	public static WebDriver driver;

	public void createBrowserInstance() throws Exception {


		String Url = FetchProperties.getPropertyValueByKey("Url");
		String browser = FetchProperties.getPropertyValueByKey("Browser");


		if (browser.equalsIgnoreCase("CHROME")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();


		} else if (browser.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();


		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new InternetExplorerDriver();


		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		driver.manage().timeouts().implicitlyWait(Global.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(Url);

	}


	public void closeBrowser() {

		driver.quit();


	}
}


//}
