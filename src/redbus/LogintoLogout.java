package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoLogout {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		
	//	Thread.sleep(3000);
		
		//driver.findElement(By.id("i-icon-profile")).click();
		
	//	Thread.sleep(3000);
		
		//driver.findElement(By.id("signInLink")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Zirakpur");
		
		//driver.findElement(By.id("mobileNoInp")).sendKeys(");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[text()='Zirakpur(punjab)']")).click();
		
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
