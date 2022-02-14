package sprint4Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class PastOrderHistory extends AutomationPage {

	public PastOrderHistory(WebDriver driver) {
		super(driver);
	}

	public void navigateToSignIn() {
		this.driver.findElement(By.cssSelector("a[class='login']")).click();
	}
	
	public void signIn() {
		WebElement emailElement = this.driver.findElement(By.cssSelector("#email"));
		WebElement passwordElement = this.driver.findElement(By.cssSelector("#passwd"));
		emailElement.sendKeys("lowaccuser@gmail.com");
		passwordElement.sendKeys("password");
		this.driver.findElement(By.cssSelector("#SubmitLogin")).click();
	}

	public void navigateToOrderHistory() {
		this.driver.findElement(By.cssSelector("a[title='Orders']")).click();
		
	}

	public void viewOrderDetails(String orderRef) {
		this.driver.findElement(By.linkText(orderRef)).click();
	}
	
	public String getOrderTotalPrice() {
		return this.driver.findElement(By.cssSelector("tr[class='totalprice item'] > td > span[class='price']")).getText();
	}

}
