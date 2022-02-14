package sprint2Cucumber.loginCucumber;

import org.testng.Assert;

import framework.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sprint1Pages.UserLogin;

public class LoginStepDefs extends TestBase {
	UserLogin userLogin;

	@Given("^user is at homepage$")
	public void user_is_at_homepage() throws Throwable {
		this.setup();
		userLogin = new UserLogin(this.getDriver());
	}
	
	@Then("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
		userLogin.navigateToSignInPage();
	}
	
	@Then("^login user with email and password$")
	public void login_user_with_email_and_password() throws Throwable {
		userLogin.signin();
	}
	
	@And("^verify user is logged in$")
	public void verify_user_is_logged_in() throws Throwable {
		String actualResult = userLogin.getMyAccountConfirmation();
		this.cleanup();
		String expectedResult = "Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(actualResult, expectedResult);
	}
}
