package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class RegisterUser extends AutomationPage{

	public RegisterUser(WebDriver driver) {
		super(driver);
	}

	public void navigateToSignInPage() {
		this.driver.findElement(By.xpath(".//a[@title='Log in to your customer account']")).click();
	}
	
	public void enterEmailCreation() {
		WebElement email = this.driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("testuseraccount@gmail.com");
		email.sendKeys(Keys.ENTER);
	}
	
	public void createAccountDetails() {
		WebElement firstName = this.driver.findElement(By.xpath(".//input[@id='customer_firstname']"));
		WebElement lastName = this.driver.findElement(By.xpath(".//input[@id='customer_lastname']"));
		WebElement password = this.driver.findElement(By.xpath(".//input[@name='passwd']"));
		firstName.sendKeys("test");
		lastName.sendKeys("lastName");
		password.sendKeys("password");
		this.driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	}
	
	public String getAccountCreatedConfirmation() {
		return this.driver.findElement(By.xpath(".//p[@class='alert alert-success']")).getText();
	}
}
