package Testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QALgendDEleteEstimate extends Base {
	public WebDriver driver;
	@Test
	
	public void AddEstimate() throws InterruptedException {
		
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		homePage.Clickon_Estimatesbutton();
		homePage.Clickon_EstimatesList_Button();
		Thread.sleep(4000);
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
		Thread.sleep(4000);
		estimatepage.clickon_EstimatesList();
		estimatepage.DeletebuttonEstimate_click();
		Assert.assertEquals(estimatepage.datevisbility(), false);
}
	
}