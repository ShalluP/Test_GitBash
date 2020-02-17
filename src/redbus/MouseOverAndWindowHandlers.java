package redbus;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class MouseOverAndWindowHandlers {
	
	static WebDriver driver;// static variable
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		
		Thread.sleep(2000);
		
		//mouse over actions
		
		
		
		  Actions product= new Actions(driver);
		  //product.moveToElement(driver.findElement(By.xpath( "//(a[@class='mainlink'])[2]"))).perform(); 
		  // what is wrong in first xpath???
		  
		  
		  product.moveToElement(driver.findElement(By.xpath("//a[text()='Products']")))
		  .perform();
		  
		  Thread.sleep(2000);
		  // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  
		  
		  Actions makingPayments = new Actions(driver);
		  
		  makingPayments.moveToElement(driver.findElement
		  (By.xpath("//a[text()='Making payments']"))).perform();
		  
		  
		  // what this statement signifies?? // webelement mosueoveraction =
		  //driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		  //Actions login= new Actions(driver);
		 // login.moveToElement(driver.findElement(By.id("loginsubmit"))).perform();
		  
		  driver.navigate().back();
		  
		 Thread.sleep(1000);
		 
		  driver.navigate().back();
//		driver.findElement(By.id("loginsubmit")).click();
		  
		
		  
		  Thread.sleep(5000);
		
	Actions action = new Actions(driver);
	
	action.moveToElement(driver.findElement(By.xpath("//a[@class='homeloginbtn']"))).build().perform();
	
	 Thread.sleep(5000);
					
	driver.findElement(By.xpath("//a[@class='homeloginbtn']")).click();
					
		System.out.println("login");
		
		Set<String> hdfcLogin = driver.getWindowHandles(); //windowhandles return type is string
		
		Iterator<String> itr = hdfcLogin.iterator();//pre-defined method to perform iterations
		
		String parent = itr.next();
		
		String child = itr.next();
		
		driver.switchTo().window(child);
		
		driver.manage().window().maximize();
		
		String url1 = driver.getCurrentUrl(); // get the current url and print it on the console
		System.out.println(url1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.close();
		
		driver.navigate().back();
		
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		
		String url2 = driver.getCurrentUrl(); // get the current url and print it on the console
		System.out.println(url2);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();
		
		
	}

}
