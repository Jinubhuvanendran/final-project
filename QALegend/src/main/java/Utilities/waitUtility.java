package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Constants.Constants;

public class waitUtility {
public WebDriver driver;

public static void waitforclickingelement(WebDriver driver, WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.Explicitwait));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public static void waitfortexttobepresentintheelement(WebDriver driver, WebElement element,String text) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.Explicitwait));
	wait.until(ExpectedConditions.textToBePresentInElement(element, text));
}
public static void waitforelementtobeselected(WebDriver driver,WebElement element) { 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.Explicitwait)); 
	wait.until(ExpectedConditions.elementToBeSelected(element));
	}
public static void waitforattributetobe(WebDriver driver,WebElement element,String atribute,String value) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.Explicitwait));
	wait.until(ExpectedConditions.attributeToBe(element, atribute, value));
}
public static void waitforVisibiltyofelement(WebDriver driver,WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.Explicitwait));
	wait.until(ExpectedConditions.visibilityOf(element));
}
}
