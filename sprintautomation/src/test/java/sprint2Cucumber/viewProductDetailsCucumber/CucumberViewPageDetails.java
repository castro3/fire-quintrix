package sprint2Cucumber.viewProductDetailsCucumber;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberViewPageDetails extends TestRunner {
	WebDriver driver;

	@Given("I am on the product page")
	public void user_is_on_Product_Page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://demoqa.com");
		driver.findElement(By.xpath(".//a[@data-id-product='6']//following-sibling::a")).click();
	}

	@When("When I look")
	public void user_can_see() {
		driver = new ChromeDriver();
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();	
	}

	@Then("I should see the product title")
	public String getTitle() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText();
	}

	@And("I should see the thumbnail image")
	public WebElement getThumbnail(String thumbnail) {
		return this.driver.findElement(By.id(thumbnail));
	}

	@And("I should see the price")
	public String getPrice() {
		return this.driver.findElement(By.id("our_price_display")).getText();
	}
	@And("I should see the reviews with ratings")
	public WebElement getReviewWithRating() {
		return this.driver.findElement(By.id("product_comments_block_tab"));
	}
}