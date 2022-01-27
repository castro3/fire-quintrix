package sprint3Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ResetPasswordTest extends TestBase {
	ResetPassword resetPassword;
	
	@Test
	public void canResetPassword() {
		resetPassword = new ResetPassword(this.getDriver());
		resetPassword.clickSignInLink();
		resetPassword.clickForgotPasswordLink();
		resetPassword.enterEmailAddressAndSubmit();
		String expectedConfirmationText = "A confirmation email has been sent to your address: Temporary21@post.com";
		Assert.assertEquals(resetPassword.getConfirmationText(), expectedConfirmationText);		
	}

	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@AfterTest
	public void afterTest() {
		cleanup();
	}

}
