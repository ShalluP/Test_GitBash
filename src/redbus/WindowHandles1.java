package redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandles1 {

	static WebDriver driver;// creating a static variable for WebDriver and naming it as driver here, so that it can be used anywhere in the program. 
	// WebDriver is an API in Selenium, which interfaces the script through the browser(Chrome here). Selenium does not have a IDE..Integrated Dev Env, so it needs Eclipse for that
	// it uses eclipse as a medium/place to run its scripts, written in Java(here, otherwise can be other languages too)
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); // setting the path for the driver, the chrome driver 
		//path is set into the webdriver and now the chrome driver acts as an interface.
		
		driver = new ChromeDriver(); // setting the chrome driver into the driver.
		
		driver.get("https://www.mercurytravels.co.in/"); // getting the url of the web application to be tested.
		
		driver.manage().window().maximize(); // maximizing the window.

		String url = driver.getCurrentUrl();
		System.out.println(url);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// performing some actions on the webapplication based on Selenium.
		
		//driver.findElement(By.xpath("//a[text()=' Indian Holidays']")).click();// why not required to 
		//click on Indian holidays
		
		driver.findElement(By.id("holiday_category_d")).sendKeys("mumbai");
		
		driver.findElement(By.xpath("//a[text()='Mumbai,India(456)']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //select
	  
		//driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search2']")).click();

		//Thread.sleep(2000); //how to make drop down choices
		//select the webelement with drop down choices, 
		//declaration and location of a drop down box element
		//1.select the webelement with drop down choices
		//2. declare and locate that webelement on the web application. syntax: 
		//webelement abc=driver.findelement(By.-(""));
		
		WebElement duration = driver.findElement(By.id("duration_d"));
	
		Select dropdown = new Select(duration); 
		// selecting the drop down option:-
		//Syntax://Select abc = new Select(element);//#select is a class and abc is an object of that class. 
		
		dropdown.selectByVisibleText("8Nights / 9Days");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search2']")).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
		driver.findElement(By.id("dphh1")).click(); //
		
		//driver.findElement(By.xpath("//input[@name='pickUpDate'][2]")).click();
		
		//driver.findElement(By.xpath("//th[text()='June 2019']")).click();
		
		driver.findElement(By.xpath("//td[@class='day  active']")).click();
		
		Thread.sleep(2000);
		
		WebElement TypeOfHoliday = driver.findElement(By.id("themes"));
		
		Select theme= new Select(TypeOfHoliday );
		
		theme.selectByVisibleText("Spa And Wellness");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary form-control search-holidaybtn']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //current url 
		  String url1= driver.getCurrentUrl(); 
		  System.out.println(url1);
		 
		 // going back to previous window
		  
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String url2= driver.getCurrentUrl();
		System.out.println(url2);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();
	
	}

}
