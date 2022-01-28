
@tag
Feature: Add product to cart
  A guest should be able to add a product to the cart from the product details page on AutomationPractice

  @tag1
  Scenario: Validate if a guest user is able to add a product to cart from the product details page.
		Given user is logged onto the Automationpractice website as a guest user
		When user clicks on a product displayed on the home page
		Then user clicks add to cart on the product details page
		Then user verifies if the product is added to cart