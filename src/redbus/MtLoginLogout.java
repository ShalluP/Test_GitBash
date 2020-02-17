package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtLoginLogout
{
	static WebDriver driver; //declaring an instance variable/static

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Selenium//ChromeDriver.exe")	;// sets the path for chromedriver
	
	driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://newtours.demoaut.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
	
	Thread.sleep(3000); //wait // what are the types of wait conditions // actions class 
	WebElement cick = driver.findElement(By.xpath("//a[text()='REGISTER']"));
	cick.click();
	
	driver.findElement(By.name("firstName")).sendKeys("SHALLU");
	driver.findElement(By.name("lastName")).sendKeys("BASSI");
	driver.findElement(By.name("phone")).sendKeys("2222222");
	//driver.findElement(By.id("userName")).sendKeys("SB@gmail.com");
	driver.findElement(By.name("userName")).sendKeys("sb@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("address1")).sendKeys("23,main road");
	driver.findElement(By.name("address2")).sendKeys("behind city center");
	driver.findElement(By.name("city")).sendKeys("Jalandhar");
	driver.findElement(By.name("state")).sendKeys("Punjab");
	driver.findElement(By.name("postalCode")).sendKeys("123222");
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.name("country"));
	
	//driver.findElement(By.)
	
	Select s = new Select(element);
	
	//s.selectByVisibleText("INDIA ");
	s.selectByValue("92");
	
	driver.findElement(By.name("email")).sendKeys("sb@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123222");
	Thread.sleep(1000);
	driver.findElement(By.name("confirmPassword")).sendKeys("123222");
	//driver.findElement(By.xpath("//input[text()='/images/forms/submit.gif')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='register']")).click();
	Thread.sleep(11000);
	driver.close();
	
	driver.findElement(By.xpath("(//input[@name='tripType'])[2]")).click();//radio button
	
	
	
	// slect by index // select by value // selct by visible text
	}

}
