package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void click(By by) {
		waitVisibility(by).click();
	}

	public void writeText(By by, String text) {
		waitVisibility(by).sendKeys(text);
	}

	public String readText(By by) {
		return waitVisibility(by).getText();
	}

	public WebElement waitVisibility(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void selectByIndex(By by, int index) {
		new Select(waitVisibility(by)).selectByIndex(index);
	}

	public void selectByValue(By by, String value) {
		new Select(waitVisibility(by)).selectByValue(value);
	}

	public List<WebElement> waitUntilElementsArePresentAndReturnList(By element) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));

		return driver.findElements(element);
	}

	public void waitUntilElementHasValue(By element, String value) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, value));
	}

}