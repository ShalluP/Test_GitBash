package redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseActions {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); //set path for chromedriver
												//driver is API for Chrome
	driver= new ChromeDriver(); //Chromedriver is now webdriver
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();	
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("women watches");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//li[text()='Watches Women'][1])")).click();
	driver.findElement(By.xpath("//li[text()='Fastrack Watches For Women']")).click(); //Choose one ctaegory
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']")).click();//tick checkbox
	
	//perform mouse over actions over men 
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().back();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement mouseoverxpath = driver.findElement(By.xpath("(//a[text()='Men'][1])"));
	Actions mover = new Actions(driver);
	mover.moveToElement(mouseoverxpath).perform();
	Thread.sleep(2000);
	//perform mouse over actions over women
	mover.moveToElement(driver.findElement(By.xpath("//a[text()='Women'][1]"))).perform();
	
	Thread.sleep(10000);
	driver.close();
	}

}
