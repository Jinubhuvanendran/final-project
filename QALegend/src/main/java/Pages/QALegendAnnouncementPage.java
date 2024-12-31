package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;

public class QALegendAnnouncementPage {
	
	public WebDriver driver;
	private pageUtilities pgeutlity;  
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement add_announcementbtn;
	
	@FindBy(id = "title")
	WebElement announcementtitle_field;
	
	@FindBy(id = "start_date")
	WebElement announcement_startdate;
	
	@FindBy(id = "end_date")
	WebElement announcement_enddate;
	
	@FindBy(xpath = "//div[@class='panel-footer clearfix']//following-sibling::button[contains(@class, 'btn-primary')]")
	WebElement announcement_savebtn;
	
	@FindBy(xpath = "//div[@id='announcement-table_filter']//descendant::input")
	WebElement announcement_searchbox;
		
	@FindBy(xpath = "(//tr[@class='odd']//a)[1]")
	WebElement announcement_title;

	public QALegendAnnouncementPage(WebDriver driver) {
		this.driver = driver;
		this.pgeutlity = new pageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddAnnouncementbtn() {	
		pgeutlity.clickOnElement(add_announcementbtn);
	}
	
	public String addAnnouncement(String title, String startdate, String enddate) {
		pgeutlity.enterTextOnWebElement(announcementtitle_field, title);
		pgeutlity.scrollElement(announcement_startdate);
		pgeutlity.enterTextOnWebElement(announcement_startdate, startdate);
		pgeutlity.enterTextOnWebElement(announcement_enddate, enddate);
		pgeutlity.clickOnElement(announcement_savebtn);
		return title; 
	}
	
	public String getAnnouncementTitle() {
		String announcementtitle = announcement_title.getText();
		return announcementtitle;
	}
	
	public void searchAnnouncement(String title) {
		pgeutlity.enterTextOnWebElement(announcement_searchbox, title);
	}
		
}
