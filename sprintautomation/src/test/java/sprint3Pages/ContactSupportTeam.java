package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import framework.AutomationPage;

public class ContactSupportTeam extends AutomationPage {
	
	public ContactSupportTeam(WebDriver driver) {
		super(driver);
	}

	public void user_is_on_Contact_Page() {
		this.driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
	}

	public void sendEmail() {
		WebElement subjectHeading = this.driver.findElement(By.id("id_contact"));
		WebElement email = this.driver.findElement(By.id("email"));
		WebElement message = this.driver.findElement(By.id("message"));

		subjectHeading.sendKeys("Customer service");
		email.sendKeys("iAmTheMasterCommander@sharklasers.com");
		message.sendKeys("How may I pay by credit card?  Thanks.");
		this.driver.findElement(By.xpath("//button[@id='submitMessage']")).click();
	}

	public String confirmation() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
	}	
}
