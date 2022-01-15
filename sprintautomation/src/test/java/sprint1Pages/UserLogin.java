package sprint1Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class UserLogin extends AutomationPage {

	public UserLogin(WebDriver driver) {
		super(driver);
	}
	
	public void navigateToSignInPage() {
		this.driver.findElement(By.xpath(".//a[@title='Log in to your customer account']")).click();
	}
	
	public void signin() {
		WebElement email = this.driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = this.driver.findElement(By.xpath("//input[@id='passwd']"));
		email.sendKeys("lowaccuser@gmail.com");
		password.sendKeys("password");
		this.driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	
	public String getMyAccountConfirmation() {
		return this.driver.findElement(By.xpath(".//p[@class='info-account']")).getText();
	}

}
