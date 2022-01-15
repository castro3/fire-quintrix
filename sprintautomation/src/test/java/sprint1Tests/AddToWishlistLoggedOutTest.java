package sprint1Tests;

import org.testng.annotations.Test;

import framework.AutomationPage;
import framework.TestBase;
import sprint1Pages.AddToWishListLoggedOut;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AddToWishlistLoggedOutTest extends TestBase {

	public AddToWishListLoggedOut addToWishlist;

	@Test
	public void f() {
		addToWishlist = new AddToWishListLoggedOut(this.getDriver());
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
