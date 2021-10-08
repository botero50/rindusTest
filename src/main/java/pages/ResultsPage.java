package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage {
	public ResultsPage(WebDriver driver) {
		super(driver);
	}

	private By resultItemsList = By.cssSelector("div[data-component-type='s-search-result']");
	private By itemPrice = By.cssSelector(".a-price > .a-offscreen");

	public List<WebElement> getListOfResults() {
		return waitUntilElementsArePresentAndReturnList(resultItemsList);
	}

	public double getPriceOfItem(WebElement item) {
		String price = item.findElement(itemPrice).getAttribute("innerHTML").replace("$", "");
		return Double.parseDouble(price);
	}
}
