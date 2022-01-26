package sprint3Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint3Pages.ProductDetailPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProductDetailPageTest  extends TestBase {

	ProductDetailPage details;

	@Test
	public void f() {

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
