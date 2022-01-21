package sprint1Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.UserLogin;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class UserLoginTest extends TestBase{
	public UserLogin userLogin;

	@Test
	public void canLoginUser() {
		String expectedResult = "Welcome to your account. Here you can manage all of your personal information and orders.";
		userLogin = new UserLogin(this.getDriver());
		userLogin.navigateToSignInPage();
		userLogin.signin();
		Assert.assertEquals(userLogin.getMyAccountConfirmation(), expectedResult);
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
