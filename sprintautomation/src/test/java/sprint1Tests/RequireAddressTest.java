package sprint1Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.RequiredAddress;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RequireAddressTest extends TestBase {

	public RequiredAddress requiredAddress;

	@Test
	public void canCheckoutWithAddress() {
		requiredAddress = new RequiredAddress(this.getDriver());
		requiredAddress.navigateToWomenTab();
		requiredAddress.addBlouseToCart();
		requiredAddress.goToCartCheckout();
		requiredAddress.clickProceedToCheckout();
		requiredAddress.signin();
		requiredAddress.submitAddress();
		requiredAddress.acceptShippingAndTerms();
		Assert.assertEquals(requiredAddress.getCheckoutTabStatus().getAttribute("class"), "step_current last");
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
