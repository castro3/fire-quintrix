package sprint4Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint4Pages.SpecialCharactersSearch;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SpecialCharactersSearchTest extends TestBase {
	SpecialCharactersSearch spSearch;

	@Test
	public void canSearchWithSpecialCharacters() {
		spSearch.searchWithSpecialCharacters();
		String actualText = spSearch.getSearchPredictions();
		String predictedText = "Blouses > Blouse";
		String actualProduct = spSearch.getProductName();
		String predictedProduct = "Blouse";
		Assert.assertEquals(actualText, predictedText);
		Assert.assertEquals(actualProduct, predictedProduct);
	}

	@BeforeMethod
	public void beforeMethod() {
		this.setup();
		spSearch = new SpecialCharactersSearch(this.getDriver());
	}

	@AfterMethod
	public void afterMethod() {
		this.cleanup();
	}

}
