import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ViewProductDetails {

	final String URL = "http://automationpractice.com/";

	@Test
	public void canNavigateToURL() {

		// Arrange

		// Act

		// Assert

	}

	@BeforeTest
	public void beforeTest() {
		driver.navigate().to(PRINTED_SUMMER_DRESS);
	}

	@AfterTest
	public void afterTest() {
		cleanup();
	}

}
