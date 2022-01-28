package sprint2Cucumber.addToCartCucumber;

import sprint1Pages.AddToCart;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartCucumber extends TestBase {

	WebDriver driver;
	AddToCart addToCart;

	@Given("^user is logged onto the Automationpractice website as a guest user$")
	public void given() throws Throwable {
		this.setup();
		addToCart = new AddToCart(this.getDriver());
	}

	@When("^user clicks on a product displayed on the home page$")
	public void click_product_displayed_on_home_page() throws Throwable {
		addToCart.navigateToBlouseDetailsPage();
	}

	@And("^user clicks add to cart on the product details page$")
	public void click_add_to_cart_button () throws Throwable {
		addToCart.addBlouseToCart();
	}

	@Then("^user verifies if the product is added to cart$")
	public void verify_added_to_cart() throws Throwable {
		String expectedResult = "Product successfully added to your shopping cart";
		Assert.assertEquals(addToCart.getAddToCartConfirmation(), expectedResult);
		this.cleanup();
	}

}
