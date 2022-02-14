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
	public void canReachCheckoutPageAndPlaceOrder() {
		String expectedCheckoutText = "Your shopping cart contains: 1 product",
			   expectedAddressText = "Low acc",
			   expectedConfirmationText = "Your order on Clothes Carnival is complete.";
		
		checkoutPage = new CheckoutPage(this.getDriver());
		checkoutPage.mouseoverAndAddDressToCart();
		checkoutPage.clickProceedToCheckout();
		Assert.assertEquals(checkoutPage.getCheckoutHeader(), expectedCheckoutText);
		checkoutPage.navigateToSignIn();
		checkoutPage.signIn();
		Assert.assertEquals(checkoutPage.getAddressText(), expectedAddressText);
		checkoutPage.navigateToShipping();
		checkoutPage.confirmShipping();
		checkoutPage.selectCheckPayment();
		checkoutPage.confirmOrder();
		Assert.assertEquals(checkoutPage.getOrderConfirmationText(), expectedConfirmationText);
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
