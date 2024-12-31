package Testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QAlegendLoginTests extends Base {
	public WebDriver driver;
	@Test(retryAnalyzer = Testscript.RetryAnalyser.class)
	
	public void logintests() throws InterruptedException {
	
		loginpage.LogintoQALegend(properties.getProperty("wrongemail"), properties.getProperty("password"));
		loginpage.Refreshdriver();
		loginpage.LogintoQALegend(properties.getProperty("email"), properties.getProperty("wrongpassword"));	
		loginpage.LogintoQALegend(properties.getProperty("email"), properties.getProperty("password"));
		
		AssertJUnit.assertEquals(true,homePage.Clickon_Dashboardbutton());
	}
}