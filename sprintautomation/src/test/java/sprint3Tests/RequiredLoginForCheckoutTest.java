package sprint3Tests;

import org.testng.annotations.Test;

import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RequiredLoginForCheckoutTest extends TestBase{
  @Test
  public void canCheckoutByLogginIn() {
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
