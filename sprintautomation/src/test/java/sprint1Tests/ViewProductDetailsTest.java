package sprint1Tests;

import org.testng.annotations.Test;

import framework.AutomationPage;
import framework.TestBase;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ViewProductDetails extends TestBase {

	public AutomationPage automationPage;
	 
	  @FindBy(how=How.ID, using="our_price_display")
	  private WebElement price;
	  
	  @Test
	  public void canSeePriceCorrectly() {
		  
		  // Arrange
		  
		  // Act
		  String expectedPrice = "$30.50";
		  String actualPrice = price.getText();
		  
		  // Assert
		  Assert.assertNotNull(actualPrice);
		  Assert.assertEquals(expectedPrice, actualPrice);
	  }
	  
//	  @Test
//	  public void canSeeProductTitle() {
//		  
//		  // Arrange
//		  
//		  // Act
////		  expectedTitle = "Printed Summer Dress";
//		  actualTitle = #center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1;
//		  
//		  // Assert
//		  Assert.AssertNotNull(actualPrice);
////		  Assert.assertEquals(expectedPrice, actualPrice);
//	  }

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
