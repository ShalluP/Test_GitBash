package selleniumPractise;

import java.beans.Expression;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium1 {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException {

		// what are the types of erros / ecxeptions in selenium
		
		 ChromeOptions option = new ChromeOptions();
		 
		 option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		try {
		driver = new ChromeDriver(option);
		
		driver.get("https://www.redbus.in"); //get the url
		
		driver.manage().window().maximize(); //maximize the window driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Zirakpur");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // give wait for max 10 seconds

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Kashmiri Gate, Delhi");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[text()='Kashmiri Gate, Delhi']")).click();
		
	//	List<WebElement> abc = driver.findElements(By.xpath("//li[text()='Kashmiri Gate, Delhi']"));

		//driver.findElement(By.xpath("//label[text()='FROM']")).sendKeys("Kashmiri Gate, Delhi"); //select source
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // give wait for max 10 seconds
		
		driver.findElement(By.id("dest")).sendKeys("'Delhi Airport"); // // find the element "destination"
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// give wait for max 10 seconds
		
		driver.findElement(By.xpath("//li[text()='Delhi Aiport']")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//td[@class='current day'])[2]")).click();
				
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // give wait for max 10 seconds

	//	
		driver.findElement(By.id("return_cal")).click();
		}
		catch(Exception e) {	
		driver.findElement(By.xpath("//li[text()='Delhi Airport']")).click();

			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("(//td[@class='current day'])[2]")).click();
					
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // give wait for max 10 seconds

		//	
			driver.findElement(By.id("return_cal")).click();
		}
		
		
		
		//driver.findElement(By.id("return_cal")).click();
		
		//driver.findElement(By.xpath("//label[text()='Return Date']")).click();
		
		//driver.findElement(By.id("search_btn")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		


		
		
	}

}
