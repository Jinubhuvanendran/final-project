package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;

public class QALegendHomepage {
	public WebDriver driver;
	private pageUtilities pgeutlity;
	@FindBy(xpath="//span[text()='Notes']")
	WebElement Dashboard_NotesButton;
	
	@FindBy(xpath="//span[text()='Lekshmi Nair']")
	public
	WebElement Dropdownbutton;
	
	@FindBy(xpath="//i[@class='fa fa-power-off mr10']")
	WebElement SignoutButton;
	
	@FindBy(xpath="//i[@class='fa fa-desktop dashboard-menu']")
	WebElement dashBoardButton;
	
	@FindBy(xpath="//span[text()='Messages']")
	WebElement MessagesButton;
	
	@FindBy(xpath="//span[text()='Projects']")
	WebElement HomeProjectButton;
	
	@FindBy(xpath="//span[text()='All Projects']")
	WebElement AllprojectsButton;
	

@FindBy(xpath="//span[text()='Estimates']")
WebElement Estimates_Button;

@FindBy(xpath="//span[text()='Estimate List']")
WebElement Estimates_List_Button;
	
@FindBy(xpath = "//span[text()='Announcements']")
WebElement dashboard_announcementbtn;
	
	
	
public QALegendHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	this.pgeutlity= new pageUtilities(driver);
	PageFactory.initElements(driver, this);
	}

public QALegendHomepage clickonDashboard_NotesButton() {	
	Dashboard_NotesButton.click();
	return this;
}
public QALegendHomepage Clickon_Dropdownbutton() {
	Dropdownbutton.click();
	return this;
}
public QALegendHomepage Clickon_SignoutButton() {
	SignoutButton.click();
	return this;
}
public boolean Clickon_Dashboardbutton() {
	dashBoardButton.click();
	return true;
}

public void Clickon_LekshmiNair() {
	Dropdownbutton.click();
}
public void Clickon_MessagesButton() {
	MessagesButton.click();
}
public void Clickon_ProjectDropdown() {
	HomeProjectButton.click();
}
public void clickon_AllprojectsDropdown() {
	AllprojectsButton.click();
}

public void Clickon_Estimatesbutton() {
	Estimates_Button.click();
}
public void Clickon_EstimatesList_Button() {
	Estimates_List_Button.click();
}	
public void clickOnDashboardAnnouncementBtn() {
	dashboard_announcementbtn.click();  
}
public void scrollSideBar() {
	pgeutlity.scrollElement(dashboard_announcementbtn);
	}

	
		
	
	
	
	
	
	
	
	
	
	
}