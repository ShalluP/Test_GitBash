package PageObjectFWTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjectFWPages.LogInPage;
import PageObjectFWPages.PayProceed;
import PageObjectFWPages.SearchBuses;
import PageObjectFWPages.ViewSeats;
import PageObjectFWUtility.BaseClass;

public class CopyTestCase2 {
	public static WebDriver driver;

	@Test(priority = 1,enabled = false)
	@Parameters({ "Uname", "Pass" })
	public void LogIn(String UserName, String Password) throws InterruptedException
	{
		LogInPage login = new LogInPage(driver);
		login.LogIn(UserName, Password);
	}

	@Test(priority = 2)
	@Parameters({ "From", "To" })
	public void TestCases1(String FromLocation, String ToLocation) throws InterruptedException 
	{
		SearchBuses search = new SearchBuses(driver);
		search.SearchBus(FromLocation, ToLocation);

		ViewSeats view = new ViewSeats(driver);
		view.OnwJourney();
		view.retJourney();

		PayProceed pay = new PayProceed(driver);
		pay.EnterPassDetails();
	}

	@BeforeClass
	public void OpenBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().deleteAllCookies();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));		
		driver.switchTo().frame(iframe);
		
		driver.switchTo().defaultContent();
		
		
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

}
