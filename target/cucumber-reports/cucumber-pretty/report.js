$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon cart Feature",
  "description": "",
  "id": "amazon-cart-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can add items to the cart and then decrease the quantity",
  "description": "",
  "id": "amazon-cart-feature;user-can-add-items-to-the-cart-and-then-decrease-the-quantity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on the \"https://www.amazon.com\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user searchs for a \"hats for men\" on the search bar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user adds \"2\" items for the first item appearing",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The user Opens the cart and check that total price and quantity are correct",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The user Reduces the quantity of the item to \"1\" in Cart for the item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "The user check that total price and quantity are correct",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com",
      "offset": 16
    }
  ],
  "location": "CartStepDefinitions.user_is_on_page(String)"
});
formatter.result({
  "duration": 3072601900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hats for men",
      "offset": 24
    }
  ],
  "location": "CartStepDefinitions.user_searchs_for(String)"
});
formatter.result({
  "duration": 2272701000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "CartStepDefinitions.user_adds_items_(String)"
});
formatter.result({
  "duration": 10844450300,
  "status": "passed"
});
formatter.match({
  "location": "CartStepDefinitions.user_opens_carat_and_check_price()"
});
formatter.result({
  "duration": 1778720600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 46
    }
  ],
  "location": "CartStepDefinitions.user_reduces_quantity(String)"
});
formatter.result({
  "duration": 639231000,
  "status": "passed"
});
formatter.match({
  "location": "CartStepDefinitions.user_checks_total_price()"
});
formatter.result({
  "duration": 1149236500,
  "status": "passed"
});
formatter.match({
  "location": "CartStepDefinitions.close_the_browser()"
});
formatter.result({
  "duration": 648181200,
  "status": "passed"
});
});