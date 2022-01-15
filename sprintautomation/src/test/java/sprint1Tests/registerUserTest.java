package sprint1Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.RegisterUser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class registerUserTest extends TestBase{
	public RegisterUser registerUser;

	@Test
	public void canRegisterUser() {
		registerUser = new RegisterUser(this.getDriver());
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
