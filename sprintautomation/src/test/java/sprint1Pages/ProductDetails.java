package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

}
