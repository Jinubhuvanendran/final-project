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
import org.testng.annotations.Test;

import Pages.QALegendNotesPage;
import Utilities.fakerUtility;

public class QALegenddeleteNote {

public class QALegendNoteTest extends Base {
	public WebDriver driver;
	@Test
	public void addNote () throws InterruptedException {
		loginpage.LogintoQALegend(properties.getProperty("email"),properties.getProperty("password"));
		homePage.clickonDashboard_NotesButton();
		notePage.clickon_AddNoteButton();
		String noteTitle = notePage.AddNote(properties.getProperty("title")+fakerUtility.Randomnmbergenerator(),properties.getProperty("description"));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(notePage.Deleteno1));
		//Thread.sleep(5000);
		notePage.clickon_delete();
		//Thread.sleep(4000);
		notePage.click_ONdeletePopup();
		//Thread.sleep(4000); 
		notePage.searchNote(noteTitle);
		AssertJUnit.assertEquals(notePage.Recordnotfound(),true); 
	}
}


}