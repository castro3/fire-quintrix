package sprint1Tests;

import org.testng.annotations.Test;

import framework.AutomationPage;
import framework.TestBase;
import sprint1Pages.AddToCart;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AddToCartTest extends TestBase {

	public AddToCart addToCart;

	@Test
	public void f() {
		addToCart = new AddToCart(this.getDriver());
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
