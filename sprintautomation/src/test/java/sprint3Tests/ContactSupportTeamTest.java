package sprint3Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint3Pages.ContactSupportTeam;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ContactSupportTeamTest extends TestBase {
	ContactSupportTeam contact;
	
	@BeforeTest
	public void beforeTest() {
		this.setup();
		contact = new ContactSupportTeam(this.getDriver());
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}
	
	@Test
	public void canEmailSupportTeam() {
		contact.user_is_on_Contact_Page();
		contact.sendEmail();
		String expectedResult = "Your message has been successfully sent to our team.";
		Assert.assertEquals(contact.confirmation(), expectedResult);
	}
}
