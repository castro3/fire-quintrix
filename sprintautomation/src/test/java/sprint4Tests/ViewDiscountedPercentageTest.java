package sprint4Tests;
import org.testng.annotations.Test;

import framework.TestBase;
import sprint4Pages.ViewDiscountedPercentage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ViewDiscountedPercentageTest extends TestBase {
  @Test
  public void canViewDiscountPercentage() {
	  String expectedPercentage = "-20%";
	  String discountedPercentage = new ViewDiscountedPercentage(this.getDriver())
	  .goToSpecials()
	  .getDiscountedPercentage();
	  Assert.assertEquals(discountedPercentage, expectedPercentage);
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
