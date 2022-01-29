package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.AutomationPage;

public class ResetPassword extends AutomationPage {

	public ResetPassword(WebDriver driver) {
		super(driver);
	}

	public void clickSignInLink() {
		this.driver.findElement(By.cssSelector("a[class='login']")).click();
	}

	public void clickForgotPasswordLink() {
		this.driver.findElement(By.cssSelector("a[title='Recover your forgotten password']")).click();
	}

	public void enterEmailAddressAndSubmit() {
		this.driver.findElement(By.cssSelector("#email")).click();
		this.driver.findElement(By.cssSelector("#email")).sendKeys("Temporary21@post.com");
		this.driver.findElement(By.cssSelector("button[class='btn btn-default button button-medium']")).click();
	}

	public String getConfirmationText() {
		String confirmationText = this.driver.findElement(By.cssSelector("p[class='alert alert-success']")).getText();
		return confirmationText;
	}	
}
