package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
	public ItemPage(WebDriver driver) {
		super(driver);
	}

	private By sizeSelector = By.id("native_dropdown_selected_size_name");
	private By quantitySelector = By.id("quantity");
	private By addToCartButton = By.id("add-to-cart-button");

	public void selectQuantity(String quantity) {
		selectByValue(quantitySelector, quantity);

	}

	public void addItem(String quantity) {

		if (driver.findElements(sizeSelector).size() > 0) {
			selectByIndex(sizeSelector, 1);
		}
		selectQuantity(quantity);
		click(addToCartButton);
	}
}
