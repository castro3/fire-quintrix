package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;
import framework.TestBase;

public class AddToWishlist extends AutomationPage {
	
	public AddToWishlist(WebDriver driver) {
		super(driver);
	}

	public void navigateToBlouse() {
		this.driver.findElement(By.xpath(".//a[@data-id-product='2']//following-sibling::a")).click();
	}
	
	public void addBlouseToWishlist() {
		WebElement addToWishlistLink = this.driver.findElement(By.xpath("//a[@id='wishlist_button']"));
		addToWishlistLink.click();
	}
	
	public String getMessageText() {
		return this.driver.findElement(By.cssSelector("p[class='fancybox-error']")).getText();
	}
	

}
