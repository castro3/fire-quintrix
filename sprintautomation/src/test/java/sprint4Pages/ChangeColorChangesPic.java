package sprint4Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.AutomationPage;

public class ChangeColorChangesPic extends AutomationPage {

	public ChangeColorChangesPic(WebDriver driver) {
		super(driver);
	}

	public void navigateToProductPage() {
		String product = "a[title='Faded Short Sleeves T-shirt']";
		this.driver.findElement(By.cssSelector(product)).click();
	}
	
	public void clickOnOrange() {
		this.driver.findElement(By.id("color_13")).click();
	}
	
	public void clickOnBlue() {
		this.driver.findElement(By.id("color_14")).click();
	}
	
	public String selectedImage() {
		return this.driver.findElement(By.id("bigpic")).getAttribute("src");
	}
}
