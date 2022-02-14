package sprint4Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class LegalNotice extends AutomationPage{
	
	public LegalNotice(WebDriver driver) {
		super(driver);
	}
	
	public void navigateToTermsPage() {	
		this.driver.findElement(By.xpath("//a[@title='Terms and conditions of use']")).click();
	}
	
	public String getTermRuleElements() {
		WebElement rule1 = this.driver.findElement(By.xpath("//h3[1]"));
		WebElement rule2 = this.driver.findElement(By.xpath("//h3[2]"));
		WebElement rule3 = this.driver.findElement(By.xpath("//h3[3]"));
		return rule1.getText() + " " + rule2.getText() + " " + rule3.getText();
	}	
}
