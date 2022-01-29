package sprint3Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint3Pages.ResetPassword;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ResetPasswordTest extends TestBase {
	ResetPassword resetPassword;
	
	@Test
	public void canResetPassword() {
		String expectedConfirmationText = "A confirmation email has been sent to your address: Temporary21@post.com";
		
		resetPassword = new ResetPassword(this.getDriver());
		resetPassword.clickSignInLink();
		resetPassword.clickForgotPasswordLink();
		resetPassword.enterEmailAddressAndSubmit();
		
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
