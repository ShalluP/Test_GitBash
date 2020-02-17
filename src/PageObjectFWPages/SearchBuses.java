package PageObjectFWPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBuses {

	@FindBy(id = "src")
	WebElement From;
	@FindBy(xpath = "//li[text()='Bangalore (All Locations)']")
	WebElement FromDest;
	
	@FindBy(id = "dest")
	WebElement Dest;
	
	@FindBy(xpath = "//li[text()='Tanuku']")
	WebElement ToDest;
	
	@FindBy(xpath = "//label[text()='Onward Date']")
	WebElement OnwDate ;
	
	@FindBy(xpath = "(//td[@class='current day'])[2]")
	WebElement SelDate1;
	
	@FindBy(xpath = "//label[text()='Return Date']")
	WebElement RetDate ;
	
	@FindBy(xpath = "(//td[text()='18'])[2]")
	WebElement SelDate2;
	
	@FindBy(xpath = "//button[@id ='search_btn' and contains(text(),'Search Buses')]")
	WebElement ClickSearchBtn;
	
	public SearchBuses(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}	
	
	//methods
	public void SearchBus(String FromLocation, String ToLocation) throws InterruptedException
	{
		From.click();
		Thread.sleep(2000);
		From.sendKeys(FromLocation);
		FromDest.click();
		
		Dest.click();
		Thread.sleep(2000);
		Dest.sendKeys(ToLocation);
		ToDest.click();
		
		OnwDate.click();
		Thread.sleep(2000);
		SelDate1.click();
		
		
		Thread.sleep(2000);
		RetDate.click();
		Thread.sleep(1000);
		SelDate2.click();
		
		Thread.sleep(1000);
		ClickSearchBtn.click();
	}
}
