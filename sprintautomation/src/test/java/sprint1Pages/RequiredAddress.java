package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class RequiredAddress extends AutomationPage {

	public RequiredAddress(WebDriver driver) {
		super(driver);
	}

	public void navigateToWomenTab() {
		this.driver.findElement(By.xpath(".//a[@class='sf-with-ul']")).click();
	}

	public void addBlouseToCart() {
		WebElement addToCartButton = this.driver.findElement(By.xpath("//a[@data-id-product='2']"));
		addToCartButton.click();
	}

	public void goToCartCheckout() {
		this.driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	}

	public void clickProceedToCheckout() {
		this.driver.findElement(By.xpath(".//a[@class='button btn btn-default standard-checkout button-medium']"))
				.click();
	}

	public void signin() {
		WebElement email = this.driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = this.driver.findElement(By.xpath("//input[@id='passwd']"));
		email.sendKeys("lowaccuser@gmail.com");
		password.sendKeys("password");
		this.driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();

	}

	public void submitAddress() {
		this.driver.findElement(By.xpath("//button[@name='processAddress']")).click();
	}

	public void acceptShippingAndTerms() {
		this.driver.findElement(By.xpath("//input[@name='cgv']")).click();
		this.driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	}

	public WebElement getCheckoutTabStatus() {
		return this.driver.findElement(By.xpath("//li[@id='step_end']"));

	}
}
