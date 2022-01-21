package sprint1Pages;

import org.openqa.selenium.By;
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
		this.driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	
	public void createAccountDetails() {
		WebElement firstName = this.driver.findElement(By.xpath(""));
		WebElement lastName = this.driver.findElement(By.xpath(""));
		WebElement password = this.driver.findElement(By.xpath(""));
		WebElement addressFirstName = this.driver.findElement(By.xpath(""));
		WebElement addressLastName = this.driver.findElement(By.xpath(""));
		WebElement address = this.driver.findElement(By.xpath(""));
		WebElement city = this.driver.findElement(By.xpath(""));
		WebElement state = this.driver.findElement(By.xpath(""));
		WebElement zipcode = this.driver.findElement(By.xpath(""));
		WebElement country = this.driver.findElement(By.xpath(""));
		WebElement homephone = this.driver.findElement(By.xpath(""));
	}
}
