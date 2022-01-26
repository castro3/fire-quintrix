package sprint3Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint3Pages.ContactSupportTeam;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ContactSupportTeamTest extends TestBase {
	ContactSupportTeam contact;
	
	@Test
	public void canEmailSupportTeam() {
		contact.user_is_on_Contact_Page();
		contact.sendEmail();
		String expectedResult = "Your message has been successfully sent to our team.";
		Assert.assertEquals(contact.confirmation(), expectedResult);
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
