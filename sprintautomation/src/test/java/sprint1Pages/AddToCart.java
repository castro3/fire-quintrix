package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.AutomationPage;

public class AddToCart extends AutomationPage {
	
	Actions actions = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	public void navigateToBlouseDetailsPage() {
		this.driver.findElement(By.xpath(".//a[@data-id-product='2']//following-sibling::a")).click();
	}

	public void addBlouseToCart() {
		this.driver.findElement(By.xpath(".//button[@name='Submit']")).click();
	}
	
	public void addMultipleBlousesToCart() {
		WebElement quantityElement = this.driver.findElement(By.cssSelector("#quantity_wanted"));		
		quantityElement.clear();
		quantityElement.sendKeys("3");
		this.driver.findElement(By.cssSelector("a[class='btn btn-default button-minus product_quantity_down']")).click();	
		this.driver.findElement(By.xpath(".//button[@name='Submit']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='continue btn btn-default button exclusive-medium']")));
		this.driver.findElement(By.cssSelector("span[class='continue btn btn-default button exclusive-medium']")).click();		
	}	

	public String getAddToCartConfirmation() {
		this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12 col-md-6']//span")).click();
		String confirmationText = this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12 col-md-6']//span[@class='title']")).getText();
		return confirmationText;
	}

	public void mouseoverAndAddShirtToCart() {
		WebElement shirtElement = this.driver.findElement(By.cssSelector("a[title^='Faded Short Sleeves T-shirt']"));
		actions.moveToElement(shirtElement).perform();
		this.driver.findElement(By.cssSelector("a[data-id-product-attribute='1']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='continue btn btn-default button exclusive-medium']")));
		this.driver.findElement(By.cssSelector("span[class='continue btn btn-default button exclusive-medium']")).click();
	}

	public void navigateToCart() {
		WebElement cartElement = this.driver.findElement(By.cssSelector("a[href='http://invenauto.tech/index.php?controller=order']"));
		actions.moveToElement(cartElement).perform();
		cartElement.click();
	}

	public String getCartHeader() {
		String confirmationText = this.driver.findElement(By.cssSelector("h1[id='cart_title'] > span[class='heading-counter']")).getText();
		return confirmationText;
	}

}
