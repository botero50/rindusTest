package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	public By subtotalLabel = By.cssSelector("#sc-subtotal-amount-buybox span");

	public Double getSubTotal() {
		String price = waitVisibility(subtotalLabel).getAttribute("innerHTML").replace("$", "");
		return Double.parseDouble(price);
	}
}
