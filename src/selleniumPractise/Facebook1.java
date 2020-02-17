package selleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement remButton = driver.findElement(By.xpath("//button[text()='Remove']"));
	remButton.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
	Email.sendKeys("shallupahwa@gmail.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	password.sendKeys("alreadygot");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	//login.click();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement FirstName = driver.findElement(By.name("firstname"));
	FirstName.sendKeys("jaman");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement LastName = driver.findElement(By.name("lastname"));
	LastName.sendKeys("lagan");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	WebElement NewEmail = driver.findElement(By.name("reg_email__"));
	NewEmail.sendKeys("abc@gmail.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement ReEmail = driver.findElement(By.name("reg_email_confirmation__"));
	ReEmail.sendKeys("abc@gmail.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement NewPass = driver.findElement(By.name("reg_passwd__"));
	NewPass.sendKeys("abcdef@g");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//drob down box 
	WebElement BirthDate = driver.findElement(By.id("month")); // Finding web element Birth date which is a dropbox
	Select MonthBox = new Select(BirthDate);// using select class and instantiating the class by creating
											// an object for that class
	MonthBox.selectByVisibleText("Nov");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement BirthDay = driver.findElement(By.id("day")); // Finding web element Birthday which is a dropbox
	Select DayBox = new Select(BirthDay); // trying to capture day
	DayBox.selectByValue("12");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement BirthYear = driver.findElement(By.id("year")); // Finding web element Birth year which is a dropbox
	Select YearBox = new Select(BirthYear); // trying to capture year
	YearBox.selectByVisibleText("1981");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement Gender = driver.findElement(By.name("sex"));
	//WebElement Gender = driver.findElement(By.id("u_0_8"));
	Gender.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	WebElement SignUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
	SignUp.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.close();
		
		
	}

}
