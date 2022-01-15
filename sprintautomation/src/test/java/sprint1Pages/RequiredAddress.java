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

	public void clickProceed() {
		this.driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	}
}
