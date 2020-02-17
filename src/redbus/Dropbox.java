package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropbox {
	static WebDriver driver;// static variable
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); //Call the drivers or set the path of chromedriver
																						 //into variable driver
		driver = new ChromeDriver();  //Chrome driver is set to Webdriver variable, driver. 
		driver.get("https://www.mercurytravels.co.in/");// puuting url in the driver
		driver.manage().window().maximize(); // maximizing the window
		
		Thread.sleep(2000);
		// select location; in which suggestion comes after typing in
		driver.findElement(By.id("holiday_category_d")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mumbai,India(456)']")).click(); // select option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search2']")).click();
		 Thread.sleep(2300);
	
		WebElement duration= driver.findElement(By.id("duration_d")); // selecting drop down box for duration,value returned 
																	//string type and stored in webElement variable duration
		Select d= new Select(duration); //select class				// pre defined class in Selenium. it is invoked by creating an instance d.
		d.selectByVisibleText("8Nights / 9Days");
		
		Actions action = new Actions(driver);
		
		// webelement mosueoveraction = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		action.moveToElement(driver.findElement(By.xpath("(//a[text()='Men'])[1]"))).perform();
		
		Thread.sleep(10000);
		driver.close();
	}

}
