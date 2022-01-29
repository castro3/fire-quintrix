package sprint1Pages;

import java.util.Random;

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
		email.sendKeys(generatedEmail() + "@gmail.com");
		email.sendKeys(Keys.ENTER);
	}
	
	private String generatedEmail() {
		String generator = "abcdefghijklmnopqrstuvwxyz";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    int length = 7;

	    for(int i = 0; i < length; i++) {
	      int index = random.nextInt(generator.length());
	      char randomChar = generator.charAt(index);
	      sb.append(randomChar);
	    }
		return sb.toString();
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
