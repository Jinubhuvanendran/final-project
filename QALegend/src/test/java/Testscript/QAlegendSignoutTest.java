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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QAlegendSignoutTest extends Base {
	public WebDriver driver;
	@Test
	public void Signout() throws InterruptedException {
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		//Thread.sleep(4000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.elementToBeClickable(homePage.Dropdownbutton));
		homePage.Clickon_LekshmiNair();
		homePage.Clickon_SignoutButton();
		AssertJUnit.assertEquals(true,loginpage.FindSigninLabel());
		
	}

}