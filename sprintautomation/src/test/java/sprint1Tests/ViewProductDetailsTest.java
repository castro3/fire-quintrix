package sprint1Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint1Pages.ProductDetails;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ViewProductDetailsTest extends TestBase {

	public ProductDetails productDetails;

	@Test
	public void canSeePriceCorrectly() {

		// Arrange
		String expectedPrice = "$30.50";
		
		// Act
		String actualPrice = productDetails.getPrice();

		// Assert
		Assert.assertNotNull(actualPrice);
		Assert.assertEquals(actualPrice, expectedPrice);
	}

		  @Test
		  public void canSeeProductTitle() {
			  
			  // Arrange
			  String expectedTitle = "Printed Summer Dress";
			  
			  // Act
			  String actualTitle = productDetails.getTitle();
			  
			  // Assert
			  Assert.assertNotNull(actualTitle);
			  Assert.assertEquals(expectedTitle, actualTitle);
		  }

	@BeforeTest
	public void beforeTest() {
		this.setup();
		getToDetailsPage();
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

	public void getToDetailsPage() {
		productDetails = new ProductDetails(this.getDriver());
		productDetails.navigateToPrintedSummerDress();
	}
}
