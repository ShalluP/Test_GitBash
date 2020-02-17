package redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveractions {

	static WebDriver driver;// instance variable
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); //Call the drivers or set the path of chromedriver
																						 //into variable driver
		driver = new ChromeDriver();  //Chrome driver is set to Webdriver variable, driver. 
		driver.get("https://www.myntra.com/");// passing  urlto launch chromdriver web application
		driver.manage().window().maximize(); // maximizing the window
		
		Thread.sleep(5000); // runs the application after completing 2000ms
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// iterates the mentioned xpath every 250ms,until the webapplication has loaded
		
		Actions action = new Actions(driver);
		
		// webelement mosueoveraction = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Men'])[1]"))).perform();
		
		Thread.sleep(10000);
		driver.close();
}
	
	}
