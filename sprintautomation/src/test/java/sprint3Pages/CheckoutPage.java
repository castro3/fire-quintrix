package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import framework.AutomationPage;

public class CheckoutPage extends AutomationPage {
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}	

	public void mouseoverAndAddDressToCart() {
        Actions actions = new Actions(driver); 
    	WebElement dressElement = this.driver.findElement(By.xpath(".//a[@data-id-product='3']//following-sibling::a"));
    	actions.moveToElement(dressElement).perform();
    	this.driver.findElement(By.cssSelector("a[class='button ajax_add_to_cart_button btn btn-default']")).click();
	}

	public void clickProceedToCheckout() {
		this.driver.findElement(By.xpath(".//div[@class='layer_cart_product col-xs-12 col-md-6']//span")).click();
		this.driver.findElement(By.cssSelector("a[class='btn btn-default button button-medium']")).click();
	}
	
	
	public String getCheckoutHeader() {
		String confirmationText = this.driver.findElement(By.cssSelector("h1[id='cart_title'] > span[class='heading-counter']")).getText();
		return confirmationText;
	}
	
	public void navigateToSignIn() {
		this.driver.findElement(By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']")).click();
	}
	
	public void signIn() {
		WebElement emailElement = this.driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passwordElement = this.driver.findElement(By.xpath("//input[@id='passwd']"));
		emailElement.sendKeys("lowaccuser@gmail.com");
		passwordElement.sendKeys("password");
		this.driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	
	public String getAddressText() {
		String addressText = this.driver.findElement(By.cssSelector("#address_delivery > li.address_firstname.address_lastname")).getText();		
		return addressText;
	}	
	
	public void navigateToShipping() {
		this.driver.findElement(By.cssSelector("button[name='processAddress']")).click();		
	}
	
	public void confirmShipping() {
		this.driver.findElement(By.cssSelector("#cgv")).click();
		this.driver.findElement(By.cssSelector("button[name='processCarrier']")).click();		
	}

	public void selectCheckPayment() {
		this.driver.findElement(By.cssSelector("a[class='cheque']")).click();
	}

	public void confirmOrder() {
		this.driver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']")).click();
	}
	
	public String getOrderConfirmationText() {
		String confirmationText = this.driver.findElement(By.cssSelector("p[class='alert alert-success'")).getText();		
		return confirmationText;		
	}
	
}
