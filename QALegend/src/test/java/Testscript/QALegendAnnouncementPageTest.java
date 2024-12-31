package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.fakerUtility;


public class QALegendAnnouncementPageTest extends Base {
	
	public WebDriver driver;
	
	@Test
	public void addAnnouncement() throws InterruptedException  {
		loginpage.LogintoQALegend(properties.getProperty("email"), properties.getProperty("password"));
		
		homePage.scrollSideBar();
		
	    homePage.clickOnDashboardAnnouncementBtn(); 
	    
	    announcementPage.clickOnAddAnnouncementbtn();
	    String announcementTitle = announcementPage.addAnnouncement(properties.getProperty("announcement_title") + fakerUtility.Randomnmbergenerator(),
	    		properties.getProperty("announcement_startdate"),
	    		properties.getProperty("announcement_endate") );   
	    homePage.scrollSideBar();
	    homePage.clickOnDashboardAnnouncementBtn(); 
	    announcementPage.searchAnnouncement(announcementTitle); 
	    Assert.assertEquals(announcementPage.getAnnouncementTitle(), announcementTitle);   
	}
}