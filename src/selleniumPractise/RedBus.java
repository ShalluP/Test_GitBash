package selleniumPractise;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedBus {
	
	
	static WebDriver driver;

	@BeforeSuite
	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		
		driver= new ChromeDriver(option);
		
		driver.get("https://www.redbus.in");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
		//driver.manage().window().maximize();
		
		
		@Test(priority = 1)
		public void source() {
	
		driver.findElement(By.id("src")).click();
		
		driver.findElement(By.id("src")).sendKeys("Kashmiri Gate, Delhi");
		
		driver.findElement(By.xpath("//li[text()='Kashmiri Gate, Delhi']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		@Test
		public void destination() {
		
		driver.findElement(By.id("dest")).sendKeys("Delhi Airport");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//li[text()='Delhi Airport']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test(priority = 2)
		public void clickbutton() {
		
		driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//td[text()='13'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test(priority = 3)
		public void changedest() {
		//driver.findElement(By.id("return_cal")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@class='onward-modify-btn g-button clearfix fl']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dest")).clear();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		
		driver.findElement(By.id("dest")).sendKeys("Dehradun");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Dehradun']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='SEARCH']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//div[@class='onward-modify-btn g-button clearfix fl']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dest")).clear();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dest")).sendKeys("Badrinath(uttarakhand)");
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Badrinath(uttarakhand)']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='SEARCH']")).click();
		
		//driver.findElement(By.xpath("//div[@class='fare d-block']")).getScreenshotAs(null);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[text()='Show buses'])[1]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='fare d-block']"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(element.getText());

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.close();
		
	}

}
