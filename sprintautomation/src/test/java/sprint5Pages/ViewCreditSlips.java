package sprint5Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.AutomationPage;
import sprint1Pages.UserLogin;

public class ViewCreditSlips extends AutomationPage {
	UserLogin user = new UserLogin(driver);
	
	public ViewCreditSlips(WebDriver driver) {
		super(driver);
	}
	
	public void goToMyCreditSlipsPage() {
		user.navigateToSignInPage();
		user.signin();
		this.driver.findElement(By.cssSelector("a[title='My credit slips']")).click();
	}
	
	public String creditSlipHeader() {
		return this.driver.findElement(By.className("page-heading")).getText();
	}
}