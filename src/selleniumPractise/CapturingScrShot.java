package selleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Time Limit : 2 hours
Write selenium tests for the following:
1. Open the page https://en.wikipedia.org/wiki/...
2. Verify that the external links in “External links“ section work
3. Click on the “Oxygen” link on the Periodic table at the bottom of the page
4. Verify that it is a “featured article”
5. Take a screenshot of the right hand box that contains element properties
6. Count the number of pdf links in “References“
7. In the search bar on top right enter “pluto” and verify that the 2 nd suggestion
is “Plutonium”*/
public class CapturingScrShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
		// Launch web browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// Open AUT
		driver.get("https://en.wikipedia.org/wiki/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Verify that the external links in “External links“ section work

		driver.findElement(By.xpath("//a[@title=\"Find out about Wikipedia\" and contains(text(),'About Wikipedia')]"))
				.click();

		driver.findElement(By.xpath("//span[text()='External links']")).click();

		String url = driver.getCurrentUrl();
		System.out.println("The url after clicking External links is: "+ url);
		// Oxygen link in the periodic table

		WebElement SearchBox = driver.findElement(By.xpath("//input[@type='search' and @name=\"search\" ]"));
		SearchBox.sendKeys("Periodic table");
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class=\"suggestions\"]//a[@title=\"Periodic table\"]")).click();
		String url1 = driver.getCurrentUrl(); 
		System.out.println("The url after entering periodic table is: "+url1);
		
		//SearchBox.click();

		WebElement Oxygen = driver.findElement(By.xpath("//span[@title=\"O , oxygen\"]"));
		Oxygen.click();
		String url2 = driver.getCurrentUrl(); 
		
		System.out.println("The url after clicking Oxygen is: "+url2);
		
		//Take a screenshot of the right hand box that contains element properties
		WebElement PhyProp = driver.findElement(By.xpath("//table[@class=\"infobox\"]//th[text()='Physical properties']"));
		PhyProp.click();
		
		Thread.sleep(10000);
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("C:\\Users\\Shallu\\eclipse-workspace\\Wahigur\\src\\selleniumPractise\\Screenshot"+ System.currentTimeMillis()+".jpg"));

		System.out.println("Screenshot Captured");
		Thread.sleep(3000);
		
		// References
		List<WebElement> Ref = driver.findElements(By.xpath("(//span[text()='References'])[1]"));
		
		
		
		//In the search bar on top right enter “pluto” and verify that the 2 nd suggestion is “Plutonium”
		
		
		 driver.findElement(By.id("searchInput")).sendKeys("Pluto");
		/*
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//div[@class=\"suggestions-results\"]//a[@title='Plutonium']")).click();
		 * 
		 * Thread.sleep(2000); String url4 = driver.getCurrentUrl();
		 * System.out.println("The url after Plutonium is:"+ url4);
		 * 
		 * boolean validate = url4.contains("Plutonium"); System.out.println(validate);
		 */
		Thread.sleep(2000);
		String s=  driver.findElement(By.xpath("//div[@class=\"suggestions-results\"]//a[@title=\"Plutonium\"]")).getText();
	//	String Plu= Pl.getText();
		System.out.println(s);
		Thread.sleep(2000);
		if(s.equals("Plutonium"))
		{
			System.out.println("It validates");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		
	
	}
	
}
