package sprint5Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint5Pages.ViewCreditSlips;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ViewCreditSlipsTest extends TestBase {
	ViewCreditSlips slip;
	
  @Test
  public void canViewCreditSlip() {
	  slip.goToMyCreditSlipsPage();
	  Assert.assertEquals(slip.creditSlipHeader(), "CREDIT SLIPS");
  }
  
  @BeforeTest
  public void beforeTest() {
	  this.setup();
	  slip = new ViewCreditSlips(this.getDriver());
  }

  @AfterTest
  public void afterTest() {
	  this.cleanup();
  }

}
