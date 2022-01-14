package sprint1Tests;

import org.testng.annotations.Test;

import framework.AutomationPage;
import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AddToWishlistLoggedOutTest extends TestBase {

	public AutomationPage automationPage;

	@Test
	public void f() {
	}

	@BeforeMethod
	public void beforeMethod() {
		this.setup();
		automationPage = new AutomationPage(this.getDriver());
	}

	@AfterMethod
	public void afterMethod() {
		this.cleanup();
	}

}
