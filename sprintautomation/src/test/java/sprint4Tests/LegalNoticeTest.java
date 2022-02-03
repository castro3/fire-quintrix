package sprint4Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint4Pages.LegalNotice;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LegalNoticeTest extends TestBase{
	LegalNotice terms;

	@BeforeTest
	public void beforeTest() {
		this.setup();
		terms = new LegalNotice(this.getDriver());
	}

	@Test
	public void findWhereTermsAreListed() {
		terms.navigateToTermsPage();
		String expectedTermRuleElements = "RULE 1 RULE 2 RULE 3";
		Assert.assertEquals(terms.getTermRuleElements(), expectedTermRuleElements);
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}
}
