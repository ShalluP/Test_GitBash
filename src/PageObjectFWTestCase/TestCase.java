package PageObjectFWTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectFWPages.LogInPage;
import PageObjectFWPages.PayProceed;
import PageObjectFWPages.SearchBuses;
import PageObjectFWPages.ViewSeats;
import PageObjectFWUtility.BaseClass;

public class TestCase extends BaseClass {
 public static WebDriver driver;
	@Test
	public void TestCases() throws InterruptedException
	{
		LogInPage login = new LogInPage(driver);
		login.LogIn(Username, Password);
		
		SearchBuses search = new SearchBuses(driver);
		search.SearchBus(FromLocation, ToLocation);
		
		ViewSeats view = new ViewSeats(driver);
		view.OnwJourney();
		view.retJourney();
		
		PayProceed pay = new PayProceed(driver);
		pay.EnterPassDetails();
		
		
	}
	@BeforeClass
	public void OpenBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}
