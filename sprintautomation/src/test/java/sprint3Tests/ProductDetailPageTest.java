package sprint3Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint3Pages.ProductDetailPage;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ProductDetailPageTest  extends TestBase {
	ProductDetailPage details;
	
	@BeforeTest
	public void beforeTest() {
		this.setup();
		details = new ProductDetailPage(this.getDriver());
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

	@Test
	public void findQuantityByClickingText() {
		details.clickText();
		String expectedQuantity = "300 Items In stock";
		String realAmount = details.getProductText();
		Assert.assertEquals(realAmount, expectedQuantity);
	}
	
	@Test
	public void findQuantityByClickingImage() {
		details.clickImage();
		String expectedQuantity = "300 Items In stock";
		String realAmount = details.getProductText();
		Assert.assertEquals(realAmount, expectedQuantity);
	}
}
