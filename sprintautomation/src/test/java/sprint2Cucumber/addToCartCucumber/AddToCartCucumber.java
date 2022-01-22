package sprint2Cucumber.addToCartCucumber;

import sprint1Pages.AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		this.driver.findElement(By.xpath(".//a[@data-id-product='7']//following-sibling::a")).click();
//		addToCart = new AddToCart(this.getDriver());
//		addToCart.navigateToBlouseDetailsPage();
//		addToCart.addBlouseToCart();
//		String expectedResult = "Product successfully added to your shopping cart";
//		Assert.assertEquals(addToCart.getAddToCartConfirmation(), expectedResult);
//		public void navigateToBlouseDetailsPage() {
//			this.driver.findElement(By.xpath(".//a[@data-id-product='7']//following-sibling::a")).click();
//		}
//
//		public void addBlouseToCart() {
//			this.driver.findElement(By.xpath(".//button[@name='Submit']")).click();
//		}

	}

	@Given("user is logged onto the Automationpractice website as a guest user.")
	public void user_is_logged_onto_the_automationpractice_website_as_a_guest_user() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on a product displayed on the home page.")
	public void user_clicks_on_a_product_displayed_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("user verifies if the product is added to cart")
	public void user_verifies_if_the_product_is_added_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("^user clicks on a product displayed on the home page$")
	public void when() throws Throwable {
		this.driver.findElement(By.xpath(".//a[@data-id-product='7']//following-sibling::a")).click();
	}

	@Then("^user should be able to view product information related to product selected$")
	public void then() throws Throwable {
	}

	@And("^user clicks on add to cart button$")
	public void and() throws Throwable {
		this.driver.findElement(By.xpath(".//button[@name='Submit']")).click();
	}

	@Then("^user verifies if the product is added to cart $")
	public void verify_added_to_cart() throws Throwable {
		this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12 col-md-6']//span")).click();
		// String confirmationText =
		// this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12
		// col-md-6']//h2")).getText();
		// return confirmationText;
	}

}
