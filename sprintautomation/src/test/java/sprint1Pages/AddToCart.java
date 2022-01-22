package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AutomationPage;

public class AddToCart extends AutomationPage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	public void navigateToBlouseDetailsPage() {
		this.driver.findElement(By.xpath(".//a[@data-id-product='2']//following-sibling::a")).click();
	}

	public void addBlouseToCart() {
		this.driver.findElement(By.xpath(".//button[@name='Submit']")).click();
	}

	public String getAddToCartConfirmation() {
		this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12 col-md-6']//span")).click();
		String confirmationText = this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12 col-md-6']//span[@class='title']")).getText();
		return confirmationText;
	}

}
