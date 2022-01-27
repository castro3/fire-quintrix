package sprint3Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint3Pages.CheckoutPage;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckoutPageTest extends TestBase {
	
	CheckoutPage checkoutPage;
	
	@Test
	public void canReachCheckoutPage() {
		checkoutPage = new CheckoutPage(this.getDriver());
		checkoutPage.mouseoverAndAddDressToCart();
		checkoutPage.clickProceedToCheckout();
		String expectedCheckoutText = "Your shopping cart contains: 1 product";
		Assert.assertEquals(checkoutPage.getCheckoutHeader(), expectedCheckoutText);		
	}

	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@AfterTest
	public void afterTest() {
		cleanup();
	}

}
