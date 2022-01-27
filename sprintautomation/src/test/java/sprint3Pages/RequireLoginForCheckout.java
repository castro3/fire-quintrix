package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class RequireLoginForCheckout extends AutomationPage {

	public RequireLoginForCheckout(WebDriver driver) {
		super(driver);
	}

	public void verifySignOut() {
		try {
			this.driver.findElement(By.xpath(".//a[@title='Log me out']")).click();
		} catch (NoSuchElementException e) {

		}
	}

	public void addItemToCart() {
		this.driver.findElement(By.xpath(".//a[@data-id-product='2']")).click();
	}

	public void proceedToCheckout() {
		this.driver.findElement(By.xpath(".//a[@title='Proceed to checkout']")).click();
	}

	public void clickCheckoutButton() {
		this.driver.findElement(By.xpath(".//a[@class='button btn btn-default standard-checkout button-medium']"))
				.click();
	}

	public void signUserIn() {
		WebElement email = this.driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = this.driver.findElement(By.xpath("//input[@id='passwd']"));
		email.sendKeys("lowaccuser@gmail.com");
		password.sendKeys("password");
		this.driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}

	public String getCheckoutAddressTabText() {
		return this.driver.findElement(By.xpath("//li[@class='step_current third']")).getText();
	}

}
