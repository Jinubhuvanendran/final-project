package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.pageUtilities;
import Utilities.waitUtility;

public class QALegendNotesPage {
	public WebDriver driver;
	private pageUtilities pgeutlity;
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement AddNoteButton;
	
	@FindBy(id="title")
	WebElement TitleField;
	
	@FindBy(id="description")
	WebElement DescriptionField;
	
	@FindBy(id ="s2id_autogen3")
	WebElement labelField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement AddNoteSaveButton;
	
	@FindBy(xpath="(//a[@class='edit'])[1]")
	WebElement TableNoteTitle;
	
	@FindBy(xpath="//div[@id='note-table_filter']//descendant::input")
	WebElement NoteSearchButton;
	
	@FindBy(xpath="(//i[@class='fa fa-times fa-fw'])[1]")
	public
	WebElement Deleteno1;
	
	@FindBy(xpath="//button[@id='confirmDeleteButton']")
	WebElement DeleteButton;
	
	@FindBy(xpath ="//td[@class='dataTables_empty']")
	WebElement NorecordFund;
	
	
	public QALegendNotesPage(WebDriver driver) {
		
		this.driver=driver;
		this.pgeutlity=new pageUtilities(driver);
		PageFactory.initElements( driver,this);
		
	}
	
	
	public String AddNote(String title, String description  ) {
		pgeutlity.Insert_Value(TitleField,title) ;
		pgeutlity.Insert_Value(DescriptionField,description);
		pgeutlity.Clickon_Element(labelField);
		pgeutlity.pressEnterkey();
		pgeutlity.Clickon_Element(AddNoteSaveButton);
		return title;
		
	}






	public QALegendNotesPage clickon_AddNoteButton() {
		AddNoteButton.click();
		return this;
	}
	public String getnotetitle() {
		String TitleField = TableNoteTitle.getText();
		return TitleField; 
	}
	public void searchNote(String noteName) {
		
		pgeutlity.Insert_Value(NoteSearchButton,noteName); 
		
	}
	public void clickon_delete() {
		Deleteno1.click();
	}
	
	public void click_ONdeletePopup() {
		DeleteButton.click();
	}
	public boolean Recordnotfound() {
		NorecordFund.isDisplayed();
		return true;
		
	}
}