package PageObjectFWUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static String Username ;
	public static String Password;
	public static String FromLocation ;
	public static String ToLocation;
	
@BeforeClass
public void OpenBrowser(String Url) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(Url);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get(TestUtils.readProperty("Url"));	
	Username = TestUtils.readProperty("UserName");
	Password = TestUtils.readProperty("Password");
	FromLocation = TestUtils.readProperty("FromLocation");
	ToLocation = TestUtils.readProperty("ToLocation");
}

@AfterClass
public void CloseBrowser()
{
	driver.close();
}
}
