package PageObjectFWPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayProceed {
	
@FindBy(name = "Name_0")
WebElement PassName ;

@FindBy(name = "Gender0")
WebElement Gender;

@FindBy(name = "Age_0")
WebElement Age;

@FindBy(xpath = "//input[@placeholder=\"Email ID\"]")
WebElement passEmail ;

@FindBy(xpath = "//input[@placeholder=\"Phone\"]")
WebElement PassPhone;


@FindBy(xpath = "//input[@value=\"Proceed to pay\"]")
WebElement PayFinal;

public PayProceed(WebDriver driver) {
 PageFactory.initElements(driver, this);
}
//methods

public void EnterPassDetails() throws InterruptedException
{
	PassName.sendKeys("Shallu");
	Thread.sleep(1000);
	
	Gender.sendKeys("F");
	Thread.sleep(1000);
	
	passEmail.sendKeys("shallupahwa@gmail.com");
	Thread.sleep(2000);
	
	PassPhone.sendKeys("999999999");
	Thread.sleep(1000);
	
	Age.sendKeys("37");
	Thread.sleep(2000);
	
	PayFinal.click();
}


}
