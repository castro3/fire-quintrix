package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class ProductDetails extends AutomationPage {

	public ProductDetails(WebDriver driver) {
		super(driver);
	}

	public void navigateToPrintedSummerDress() {
		this.driver.findElement(By.xpath(".//a[@data-id-product='6']//following-sibling::a")).click();
	}

	public String getPrice() {
		return this.driver.findElement(By.id("our_price_display")).getText();
	}

	public String getTitle() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText();
	}

	public WebElement getThumbnail(String thumbnail) {
		return this.driver.findElement(By.id(thumbnail));
	}
	
	public WebElement getReviewWithRating() {
		try {
			return this.driver.findElement(By.id("product_comments_block_tab"));
		}
		catch (NoSuchElementException e){
			System.out.println("Hmm... there isn't a review or rating for this.");
		}
		return null;
	}
}
