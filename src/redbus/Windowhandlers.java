package redbus;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlers {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe"); //set path for chromedriver
		//driver is API for Chrome
		driver= new ChromeDriver(); //Chromedriver is now webdriver
		
		driver.get("https://www.yesbank.in/digital-banking/online-banking/netbanking-services");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		
		System.out.println("clicked on login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Get Started > >'] ")).click();
		
		System.out.println("clicked on getstarted");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> yesbank = driver.getWindowHandles();
		
		Iterator<String> itr = yesbank.iterator();//2 windows of yes bank to be iterated
		// if any number of windows are open, it will be iterated
		String parent = itr.next();
		
		String child = itr.next();
		
		driver.switchTo().window(child);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.findElement(By.xpath("//a[@onclick='javascript:ContinuePage();'][1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.navigate().back();
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		String url1 = driver.getCurrentUrl(); // for printing different strings,do we need to give create diff instances or objects?
		
		System.out.println(url1);
		
		//System.out.println(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
