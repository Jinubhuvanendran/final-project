package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.fakerUtility;
import Utilities.pageUtilities;

public class QALegendEstimatePage {
	public WebDriver driver;
	private pageUtilities pgeutlity; 
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement AddEstimate_Button;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement Estimate_datebutton;
	
	@FindBy(xpath="//td[@class='today day']")
	WebElement EstimateDateCalendar; 
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement Valid_Untilbutton;
	
	@FindBy(xpath="//td[text()='20']")
	WebElement Validuntilcalendardate;
	
	@FindBy(xpath="//div[@class='select2-container select2 validate-hidden']")
	WebElement ClientDropdown;
	
	@FindBy(xpath="(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[5]")
	WebElement Dropdown_ChoiceClient;
	
	@FindBy(xpath="(//span[@class='select2-chosen'])[4]")
	WebElement Tax_click;
	
	@FindBy(xpath="(//div[@class='select2-result-label'])[2]")
	WebElement Tax_dropdown;
	
	@FindBy(xpath="(//span[@class='select2-chosen'])[5]")
	WebElement Secondtax_click;
	
	@FindBy(xpath="//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']")
	WebElement secondtax_Dropdown;
	
	@FindBy(xpath="//textarea[@id='estimate_note']")
	WebElement noteclick;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement savebutton;
	
	@FindBy(xpath="//span[@class='mt0 label label-default large']")
	WebElement StatusDraft;
	
	@FindBy(xpath="(//i[@class='fa fa-times fa-fw'])[1]")
	WebElement FirstEstimateDeleteButton;
	
	@FindBy(xpath="(//i[@class='dot fa fa-circle'])[5]")
	WebElement Estimateslist;
	
	@FindBy(xpath="//td[text()='2024-12-09']")
	WebElement DateEstmate;
	
	
	
	
	
	
	
public QALegendEstimatePage(WebDriver driver) {
	this.driver=driver;
	this.pgeutlity= new pageUtilities(driver);
	PageFactory.initElements(driver,this);
	
	
}
	
	
	
	public void Clickon_AddEstimate() {
		AddEstimate_Button.click();
	}
	
	public void clickon_EstimateDate() {
		Estimate_datebutton.click();
	}
	
	public void Clickon_Date() {
		EstimateDateCalendar.click();
	}
	
	public void clickon_ValidUntil() {
		Valid_Untilbutton.click();
	}
	public void clickon_Date1() {
		Validuntilcalendardate.click();
	}
	
	public void clickon_Clientdropdown() {
		ClientDropdown.click();
	}
	public void clickon_Dropdownchoice_Client() {
		Dropdown_ChoiceClient.click();
	}
	
	public void clickon_Taxbutton() {
		Tax_click.click();
	}
	
	public void clickon_Taxdropdown() {
		Tax_dropdown.click();
	}
	
	public void clickon_Secondtax() {
		Secondtax_click.click();
	}
	
	public void clickon_secondTaxdropdown() {
		secondtax_Dropdown.click();
	}
	public void clickon_notebutton() {
		noteclick.click();
	}
	public void addnote() {
		noteclick.sendKeys("notes1"+fakerUtility.Randomnmbergenerator());
	}
	
	public void clickonsave() {
		savebutton.click();
	}
	
	public boolean Statusdraftvisibility() {
		StatusDraft.isDisplayed();
		return true;
		
	}
	
	public void DeletebuttonEstimate_click() {
		FirstEstimateDeleteButton.click();
	}
	
	public void clickon_EstimatesList() {
		Estimateslist.click();
	}
	public boolean datevisbility() {
		DateEstmate.isDisplayed();
		return false;
		
	}
}