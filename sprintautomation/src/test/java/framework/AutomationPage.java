package framework;
import org.openqa.selenium.WebDriver;

public class AutomationPage {
	
	protected WebDriver driver;
	private final String url = "http://www.invenauto.tech/index.php";

	public AutomationPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to(this.url);
	}
}

