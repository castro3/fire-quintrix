package sprint3Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint3Pages.SearchItemsByModifiers;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SearchItemsByModifiersTest extends TestBase {

	SearchItemsByModifiers searchItems;

	@Test
	public void canSearchByKeyword() {
		searchItems.searchByKeyword();
		String titleOfProduct = searchItems.getProductTitle();
		String expectedTitle = "Printed Dress";
		Assert.assertEquals(titleOfProduct, expectedTitle);
	}

	@Test
	public void canSearchByCategory() {
		String categoryText = "You will find here all woman fashion collections.\n"
				+ "This category includes all the basics of your wardrobe and much more:\n"
				+ "shoes, accessories, printed t-shirts, feminine dresses, women's jeans!";
		searchItems.searchByCategory();
		String womanTextOutput = searchItems.getWomanCategoryText();
		Assert.assertEquals(womanTextOutput, categoryText);
	}

	@Test
	public void canSearchBySubCategory() {
	}

	@Test
	public void canSearchByFilter() {
	}

	@Test
	public void canSearchBySort() {
	}

	@BeforeMethod
	public void beforeMethod() {
		this.setup();
		searchItems = new SearchItemsByModifiers(this.getDriver());
	}

	@AfterMethod
	public void afterMethod() {
		this.cleanup();
	}

}
