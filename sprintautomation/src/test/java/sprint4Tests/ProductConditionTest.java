package sprint4Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint4Pages.ProductCondition;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ProductConditionTest extends TestBase{

	ProductCondition product;

	@Test
	public void canViewProductCondition() {
		product.navigateToProductPage();
		Assert.assertNotNull(product.getProductCondition());
	}
	
	@BeforeTest
	public void beforeTest() {
		this.setup();
		product = new ProductCondition(this.getDriver());
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}
}
