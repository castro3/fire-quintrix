package sprint1Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint1Pages.ProductDetails;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
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

	@Test
	public void canSeeThumbnail() {

		// Arrange
		String picture1 = "thumb_16";
		String picture2 = "thumb_17";
		String picture3 = "thumb_18";
		String picture4 = "thumb_19";

		// Act
		productDetails.getTitle();

		// Assert
		Assert.assertNotNull(productDetails.getThumbnail(picture1));
		Assert.assertNotNull(productDetails.getThumbnail(picture2));
		Assert.assertNotNull(productDetails.getThumbnail(picture3));
		Assert.assertNotNull(productDetails.getThumbnail(picture4));
	}
	
	@Test
	public void canSeeReviewWithRating() {

		// Arrange

		// Act
		WebElement review = productDetails.getReviewWithRating();

		// Assert
		Assert.assertNotNull(review);
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
