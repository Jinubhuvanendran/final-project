package Testscript;

import org.testng.annotations.Test;

import Pages.QALegendEstimatePage;

import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QALgendDEleteEstimate extends Base {
	public WebDriver driver;
	@Test
	
	public void AddEstimate() throws InterruptedException {
		
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		homePage.Clickon_Estimatesbutton();
		homePage.Clickon_EstimatesList_Button();
		
		estimatepage.Clickon_AddEstimate();
		estimatepage.clickon_EstimateDate();
		estimatepage.Clickon_Date();
		estimatepage.clickon_ValidUntil();
		estimatepage.clickon_Date1();
		estimatepage.clickon_Clientdropdown();
		estimatepage.clickon_Dropdownchoice_Client();
		estimatepage.clickon_Taxbutton();
		estimatepage.clickon_Taxdropdown();
		estimatepage.clickon_Secondtax();
		estimatepage.clickon_secondTaxdropdown();
		estimatepage.clickon_notebutton();
		estimatepage.addnote();
		estimatepage.clickonsave();
		WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait3.until(ExpectedConditions.elementToBeClickable(estimatepage.Estimateslist));
		estimatepage.clickon_EstimatesList();
		estimatepage.DeletebuttonEstimate_click();
		Assert.assertEquals(estimatepage.datevisbility(), false);
}
	
}