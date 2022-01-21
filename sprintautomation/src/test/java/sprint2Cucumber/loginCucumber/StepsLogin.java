package sprint2Cucumber.loginCucumber;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sprint1Pages.UserLogin;

public class StepsLogin extends LoginTestRunner{
	
	WebDriver driver;
	UserLogin userLogin;

	@Given("^user is at homepage$")
	public void homepage() throws Throwable {
		userLogin = new UserLogin(this.getDriver());
	}
	
	@Then("^click on login button$")
	public void clickLogin() throws Throwable {
		userLogin.navigateToSignInPage();
	}
	
	@Then("^login user with email and password$")
	public void login_user_with_email_and_password() throws Throwable {
		userLogin.signin();
	}
	
	@And("^verify user is logged in$")
	public void verify_user_is_logged_in() throws Throwable {
		String expectedResult = "Welcome to your account. Here you can manage all of your personal information and orders.";
		Assert.assertEquals(userLogin.getMyAccountConfirmation(), expectedResult);
	}
}
