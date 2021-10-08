package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import common.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CartPage;
import pages.ItemPage;
import pages.ResultsPage;
import pages.TopMenuPage;

public class CartStepDefinitions extends BaseTest {
	TopMenuPage topMenu;
	ResultsPage resultsPage;
	CartPage cartPage;
	ItemPage itemPage;
	Double price;

	@Given("^User is on the \"(.*)\" page$")
	public void user_is_on_page(String page) {
		navigate(page);
		topMenu = new TopMenuPage(driver);
		resultsPage = new ResultsPage(driver);
		itemPage = new ItemPage(driver);
		cartPage = new CartPage(driver);
	}

	@When("^The user searchs for a \"(.*)\" on the search bar$")
	public void user_searchs_for(String item) {
		topMenu.searchItem(item);
	}

	@Then("^The user adds \"(.*)\" items for the first item appearing$")
	public void user_adds_items_(String quantity) {
		List<WebElement> elements = resultsPage.getListOfResults();
		price = resultsPage.getPriceOfItem(elements.get(0)) * Double.parseDouble(quantity);
		elements.get(0).click();
		itemPage.addItem(quantity);
		topMenu.waitUntilSelectorChangeValue(quantity);
	}

	@Then("^The user Opens the cart and check that total price and quantity are correct$")
	public void user_opens_carat_and_check_price() {
		topMenu.openCart();
		Assert.assertEquals(cartPage.getSubTotal(), price);
	}

	@Then("^The user Reduces the quantity of the item to \"([^\\\"]*)\" in Cart for the item$")
	public void user_reduces_quantity(String quantity) {
		itemPage.selectQuantity(quantity);
		topMenu.waitUntilSelectorChangeValue(quantity);
		price = price / 2;
	}

	@Then("^The user check that total price and quantity are correct$")
	public void user_checks_total_price() {
		topMenu.openCart();
		Assert.assertEquals(cartPage.getSubTotal(), price);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
