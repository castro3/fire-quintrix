package sprint3Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint3Pages.RequireLoginForCheckout;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RequiredLoginForCheckoutTest extends TestBase {
	RequireLoginForCheckout requireCheckout;

	@Test
	public void canCheckoutByLoggingIn() {
		requireCheckout.addItemToCart();
		requireCheckout.proceedToCheckout();
		requireCheckout.clickCheckoutButton();
		requireCheckout.signUserIn();
		String addressTextTab = "Address";
		String actualTextTab = requireCheckout.getCheckoutAddressTabText();
		Assert.assertEquals(actualTextTab, addressTextTab);
	}

	@BeforeMethod
	public void beforeMethod() {
		this.setup();
		requireCheckout = new RequireLoginForCheckout(this.getDriver());
		requireCheckout.verifySignOut();
	}

	@AfterMethod
	public void afterMethod() {
		this.cleanup();
	}

}
