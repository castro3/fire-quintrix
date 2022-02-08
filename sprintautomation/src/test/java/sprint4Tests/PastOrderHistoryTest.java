package sprint4Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint4Pages.PastOrderHistory;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PastOrderHistoryTest extends TestBase {

	PastOrderHistory pastOrderHistory;

	@Test
	public void canViewPastOrderHistory() {

		String orderRef = "RPMVYAQZF", expectedTotal = "$23.51", actualTotal = "";

		pastOrderHistory = new PastOrderHistory(this.getDriver());
		pastOrderHistory.navigateToSignIn();
		pastOrderHistory.signIn();
		pastOrderHistory.navigateToOrderHistory();
		pastOrderHistory.viewOrderDetails(orderRef);
		actualTotal = pastOrderHistory.getOrderTotalPrice();

		Assert.assertEquals(actualTotal, expectedTotal);

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
