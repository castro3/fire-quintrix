package sprint4Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.AutomationPage;

public class ProductCondition extends AutomationPage {

	public ProductCondition(WebDriver driver) {
		super(driver);
	}
	
	public void navigateToProductPage() {
		String product = "a[title='Faded Short Sleeves T-shirt']";
		this.driver.findElement(By.cssSelector(product)).click();
	}
	
	public String getProductCondition() {
		return this.driver.findElement(By.cssSelector("#product_condition > span")).getText();
	}
}
