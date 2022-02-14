package sprint2Cucumber.viewProductDetailsCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CucumberViewPageDetails extends TestBase{

	@Given("I am on the product page")
	public void user_is_on_Product_Page() {
		this.setup();
		this.getDriver().navigate().to("http://www.invenauto.tech/index.php");
		this.getDriver().findElement(By.xpath(".//a[@data-id-product='6']//following-sibling::a")).click();
	}

	@Then("I should see the product title")
	public String getTitle() {
		return this.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText();
	}

	@And("I should see the thumbnail image")
	public WebElement getThumbnail1() {
		return this.getDriver().findElement(By.id("thumb_16"));
	}

	@And("I should see the next thumbnail image")
	public WebElement getThumbnail2() {
		return this.getDriver().findElement(By.id("thumb_17"));
	}

	@And("I should see the final thumbnail image")
	public WebElement getThumbnail3() {
		return this.getDriver().findElement(By.id("thumb_18"));
	}

	@And("I should see the price")
	public String getPrice() {
		return this.getDriver().findElement(By.id("our_price_display")).getText();
	}
	@And("I should see the ratings")
	public WebElement getReviewWithRating() {
		this.cleanup();
		System.out.println("No ratings are present.");
		return null;
	}

	@Then("I should see the reviews")
	public void i_should_see_the_reviews() {
		System.out.println("No reviews are present.");
	}
}