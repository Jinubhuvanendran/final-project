package Testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QALegendProjectEditTest extends Base {
	public WebDriver driver;
	@Test
	public void edit_test() throws InterruptedException {
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		
		homePage.Clickon_ProjectDropdown();
		homePage.clickon_AllprojectsDropdown();
		
		projectpage.clickon_edit();
		projectpage.clickon_title();
		projectpage.clearthetitle();
		//projectpage.clickonbackspace();
		projectpage.eneterdata_title();
		projectpage.savethetitle();
		
	}

}