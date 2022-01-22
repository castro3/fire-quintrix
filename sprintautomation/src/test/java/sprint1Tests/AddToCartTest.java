package sprint1Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.AddToCart;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AddToCartTest extends TestBase {

	public AddToCart addToCart;

	@Test
	public void canAddToShoppingCart() {
		addToCart = new AddToCart(this.getDriver());
		addToCart.navigateToBlouseDetailsPage();
		addToCart.addBlouseToCart();
		String expectedResult = "Product successfully added to your shopping cart";
		Assert.assertEquals(addToCart.getAddToCartConfirmation(), expectedResult);
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
