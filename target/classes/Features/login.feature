Feature: Amazon cart Feature

Scenario: User can add items to the cart and then decrease the quantity

Given User is on the "https://www.amazon.com" page
When The user searchs for a "hats for men" on the search bar
	And The user adds "2" items for the first item appearing
Then The user Opens the cart and check that total price and quantity are correct
	And The user Reduces the quantity of the item to "1" in Cart for the item
	And The user check that total price and quantity are correct
	And Close the browser