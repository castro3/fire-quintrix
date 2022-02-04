package sprint4Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.AddToCart;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AddMultipleItemsToCartTest extends TestBase {

	public AddToCart addToCart;
	
	@Test
	public void canAddMultipleItemsToShoppingCart() {
		String expectedResult = "Your shopping cart contains: 3 products";		
		addToCart = new AddToCart(this.getDriver());
		
		addToCart.mouseoverAndAddShirtToCart();
		addToCart.navigateToBlouseDetailsPage();
		addToCart.addMultipleBlousesToCart();
		addToCart.navigateToCart();
		
		Assert.assertEquals(addToCart.getCartHeader(), expectedResult);
	}	

	@BeforeMethod
	public void beforeMethod() {
		this.setup();
	}

	@AfterMethod
	public void afterMethod() {
		this.cleanup();
	}

}
