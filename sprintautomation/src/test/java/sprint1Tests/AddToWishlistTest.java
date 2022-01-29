package sprint1Tests;

import org.testng.annotations.Test;

import framework.TestBase;
import sprint1Pages.AddToWishlist;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AddToWishlistTest extends TestBase {
	
	public AddToWishlist addToWishlist;
	
	@Test
	public void cannotAddToWishlistWithoutLogin() {
		String expectedMessage = "You must be logged in to manage your wishlist.";
		
		try {
			addToWishlist.addBlouseToWishlist();			
			String actualMessage = addToWishlist.getMessageText();
			Assert.assertEquals(actualMessage, expectedMessage);
		}
		catch (NoSuchElementException e) {
			
		}
		
	}

	@BeforeTest
	public void beforeTest() {
		this.setup();
		getToDetailsPage();
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

	public void getToDetailsPage() {
		addToWishlist = new AddToWishlist(this.getDriver());
		addToWishlist.navigateToBlouse();
	}
}
