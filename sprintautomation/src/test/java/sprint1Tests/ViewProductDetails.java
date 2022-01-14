package sprint1Tests;

import org.testng.annotations.Test;

import framework.AutomationPage;
import framework.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ViewProductDetails extends TestBase {

	public AutomationPage automationPage;

	@Test
	public void canNavigateToURL() {

		// Arrange

		// Act

		// Assert

	}

	@BeforeTest
	public void beforeTest() {
		this.setup();
		automationPage = new AutomationPage(this.getDriver());
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

}
