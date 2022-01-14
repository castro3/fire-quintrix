import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ViewProductDetails {

	final String URL = "http://automationpractice.com/";
	final String PRINTED_SUMMER_DRESS = "http://automationpractice.com/index.php?id_product=6&controller=product";
	  
	  @Test
	  public void canSeePriceCorrectly() {
		  
		  // Arrange
		  
		  // Act
		  expectedPrice = "$30.50";
		  actualPrice = span id="our_price_display" inner text();
		  
		  // Assert
		  Assert.AssertNotNull(actualPrice);
		  Assert.assertEquals(expectedPrice, actualPrice);
	  }
	  
	  @Test
	  public void canSeeProductTitle() {
		  
		  // Arrange
		  
		  // Act
//		  expectedTitle = "Printed Summer Dress";
		  actualTitle = #center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1;
		  
		  // Assert
		  Assert.AssertNotNull(actualPrice);
//		  Assert.assertEquals(expectedPrice, actualPrice);
	  }
	  
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
