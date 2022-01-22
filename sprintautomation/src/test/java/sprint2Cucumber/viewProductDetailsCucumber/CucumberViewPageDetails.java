package sprint2Cucumber.viewProductDetailsCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberViewPageDetails extends TestBase{

	@Given("I am on the product page")
	public void user_is_on_Product_Page() {
		this.setup();
		this.getDriver().navigate().to("http://www.invenauto.tech/index.php");
		this.getDriver().findElement(By.xpath(".//a[@data-id-product='6']//following-sibling::a")).click();
	}

	@When("I look")
	public void user_can_see() {
		this.getDriver().findElement(By.xpath(".//*[@id='account']/a")).click();	
	}

	@Then("I should see the product title")
	public String getTitle() {
		return this.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText();
	}

	@And("I should see the thumbnail image")
	public WebElement getThumbnail(String thumbnail) {
		return this.getDriver().findElement(By.id(thumbnail));
	}

	@And("I should see the price")
	public String getPrice() {
		return this.getDriver().findElement(By.id("our_price_display")).getText();
	}
	@And("I should see the ratings")
	public WebElement getReviewWithRating() {
		return this.getDriver().findElement(By.id("product_comments_block_tab"));
	}

	@Then("I should see the reviews")
	public void i_should_see_the_reviews() {
		this.cleanup();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}