package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuPage extends BasePage {

	public TopMenuPage(WebDriver driver) {
		super(driver);
	}

	private By searchInput = By.id("twotabsearchtextbox");
	private By searchButton = By.id("nav-search-submit-button");
	private By cartCountLabel = By.id("nav-cart-count");

	public void searchItem(String itemToSearch) {
		writeText(searchInput, itemToSearch);
		click(searchButton);
	}

	public void openCart() {
		click(cartCountLabel);
	}

	public void waitUntilSelectorChangeValue(String value) {
		waitUntilElementHasValue(cartCountLabel, value);
	}
}
