package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPage {
	
	protected WebDriver driver;
	private final String url = "http://automationpractice.com/index.php";

	public AutomationPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to(url);
	}
	
	public WebElement findElement(By by) {
		return this.driver.findElement(by);
	}
}

