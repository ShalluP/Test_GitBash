package PageObjectFWPages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
public static WebDriver driver;
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// Locators
	@FindBy(id = "signin-block")
	WebElement ClickSignIn;
	
	@FindBy(xpath = "//li[text()='Sign In/Sign Up']")
	WebElement SignUp;
	//xpath = "//div[@id='facebookBtn']
	@FindBy(id = "facebookBtn")
			//button[text()='Sign in with Facebook']")
	WebElement FbLogIn;
	
	@FindBy(id = "email")
	WebElement EmailId;
	
	@FindBy(id = "pass")
	WebElement Pass ;
	
	@FindBy(xpath = "//input[@name='login']")
	WebElement ClickLogIn ;
	
	@FindBy(id = "checkpointSubmitButton")
	WebElement Submit ;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement FbEmail;
	
	//
	@FindBy(xpath = "//input[@name='pass']")
	WebElement FbPass;
	
	//methods
	public void LogIn(String UserName, String Password) throws InterruptedException
	{
		ClickSignIn.click();
		Thread.sleep(2000);
		
		SignUp.click();
		Thread.sleep(3000);
		
		/*
		 * String s = driver.getWindowHandle(); //driver.switchTo().window(s);
		 * System.out.println("the current window handle is :"+s);
		 * 
		 */
		FbLogIn.click();
		Thread.sleep(1000);
		
		/*
		 * Set<String> wh = driver.getWindowHandles(); for(String s1:wh) {
		 * System.out.println("the window handles are: "+s1);
		 * driver.switchTo().window(s1);
		 * 
		 * }
		 */
		
		FbEmail.sendKeys(UserName);
		Thread.sleep(2000);
		FbPass.sendKeys(Password);
		Thread.sleep(2000);
		
		ClickLogIn.click();
		Thread.sleep(2000);
		Submit.click();
	}
	
}
