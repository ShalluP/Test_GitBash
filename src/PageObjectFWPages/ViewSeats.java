package PageObjectFWPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSeats {

	@FindBy(xpath = "(//div[text()='View Seats'])[1]")
	WebElement ViewSeats1;

	/*
	 * @FindBy(xpath =
	 * "//span[text()='Click on an Available seat to proceed with your transaction.']"
	 * ) WebElement AvalSeat;
	 */
	@FindBy(xpath = "//canvas[@class='pointer']")
	// @FindBy(xpath = "//canvas[@data-type=\"lower\"]") ////
	// canvas[@class="pointer"]
	WebElement SelSeat1;

	@FindBy(xpath = "(//div[@class=\"radio-css \"])[1]")
//@FindBy(xpath = "//*[@id=\"11123821\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/ul/li[1]/div[1]/div")
	// @FindBy(xpath = "//div[@class='radio-unchecked']")
	WebElement PickUpLocation1;

	/*
	 * @FindBy(xpath = "//span[text()='DROPPING POINT']") WebElement ClickDropLoc1;
	 * 
	 * @FindBy(xpath = "//div[@class='radio-unchecked']") WebElement DropLocation1;
	 */

	@FindBy(xpath = "//button[text()='continue']")
	WebElement ClickCont1;

	@FindBy(xpath = "//button[text()='Proceed to book']")
	WebElement PayOnw;

	// alert
	@FindBy(xpath = "//a[@id=\"no{{doj}}\" and contains(text(),'no')]")
	WebElement ClickNo;
	
	// return journey
	@FindBy(xpath = "//span[text()='21']")
	WebElement SelRetDate;
	
	
	@FindBy(xpath = "(//div[text()='View Seats'])[1]")
	WebElement ViewRetSeats;

	@FindBy(xpath = "//canvas[@data-type=\"lower\"]") //// canvas[@class="pointer"]
	WebElement SelSeatRet;

	/*
	 * @FindBy(xpath = "//span[text()='DROPPING POINT']") WebElement ClickDropLoc2;
	 * 
	 * @FindBy(xpath = "(//div[@class='radio-unchecked'])[1]") WebElement
	 * SelDropLocation2;
	 */
//continue
	@FindBy(xpath = "//button[text()='continue']")
	WebElement ClickContRet;
	
	 @FindBy(xpath = "(//div[@class='radio-unchecked'])[1]")
	 WebElement SelDropLocation2;
	/*
	 * @FindBy(xpath = "//button[text()='continue']") WebElement ClickContRet;
	 */

	@FindBy(xpath = "//button[text()='Proceed to book']")
	WebElement PayRet;

	@FindBy(xpath = "//a[text()='Got It']")
	WebElement ClickGotIt;

	// methods
	public void OnwJourney() throws InterruptedException {
		ViewSeats1.click();
		Thread.sleep(2000);
		System.out.println("Seats viewed");

		SelSeat1.click();
		Thread.sleep(2000);
		System.out.println("Seats selected");

		PickUpLocation1.click();
		Thread.sleep(1000);
		System.out.println("pick up location selected");

	//	ClickDropLoc1.click();
	//	Thread.sleep(1000);

		System.out.println("drop location selected");

	//	DropLocation1.click();
	//	Thread.sleep(1000);

		ClickCont1.click();
		Thread.sleep(1000);
		System.out.println("clicked on continue");

		PayOnw.click();
		Thread.sleep(2000);
		System.out.println("paid for onward journey");
	}

	public void retJourney() throws InterruptedException {
		
		ClickNo.click();
		Thread.sleep(2000);
		
		SelRetDate.click();
		
		ViewRetSeats.click();
		Thread.sleep(1000);

	//	SelSeatRet.click();
	//	Thread.sleep(1000);

		/*
		 * ClickDropLoc2.click(); Thread.sleep(1000);
		 * 
		 * SelDropLocation2.click(); Thread.sleep(1000);
		 */
		ClickContRet.click();
		
		SelDropLocation2.click(); 
		Thread.sleep(1000);
		
		PayRet.click();
		Thread.sleep(1000);

		ClickGotIt.click();
	}

	public ViewSeats(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
