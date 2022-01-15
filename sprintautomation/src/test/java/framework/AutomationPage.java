package framework;
import org.openqa.selenium.WebDriver;

public class AutomationPage {
	
	protected WebDriver driver;
	private final String url = "http://automationpractice.com/index.php";

	public AutomationPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to(this.url);
	}
}

