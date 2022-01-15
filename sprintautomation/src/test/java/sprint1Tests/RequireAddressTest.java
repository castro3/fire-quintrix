package sprint1Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.RequiredAddress;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RequireAddressTest extends TestBase {

	public RequiredAddress requiredAddress;

	@Test
	public void canCheckoutWithAddress() {
		requiredAddress = new RequiredAddress(this.getDriver());
		requiredAddress.navigateToWomenTab();
		requiredAddress.addBlouseToCart();
		requiredAddress.clickProceed();
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
