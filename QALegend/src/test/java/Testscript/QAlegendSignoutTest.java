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
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QAlegendSignoutTest extends Base {
	public WebDriver driver;
	@Test
	public void Signout() throws InterruptedException {
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		Thread.sleep(4000);
		homePage.Clickon_LekshmiNair();
		homePage.Clickon_SignoutButton();
		AssertJUnit.assertEquals(true,loginpage.FindSigninLabel());
		
	}

}