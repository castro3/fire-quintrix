package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import framework.AutomationPage;

public class ProductDetailPage extends AutomationPage {

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickText() {	
		this.driver.findElement(By.xpath("//a[@title='Printed Chiffon Dress']")).click();
	}

	public void clickImage() {
		this.driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']")).click();
	}
	
	public String getProductText() {
		WebElement quantity = this.driver.findElement(By.id("quantityAvailable"));
		WebElement type = this.driver.findElement(By.id("quantityAvailableTxtMultiple"));
		WebElement inStock = this.driver.findElement(By.id("availability_value"));
		return quantity.getText() + " " + type.getText() + " " + inStock.getText();
		
	}	
}
