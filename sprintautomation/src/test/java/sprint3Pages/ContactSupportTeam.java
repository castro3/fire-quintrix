package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import framework.TestBase;

public class ContactSupportTeam  extends TestBase {
	public final String MAIN = "http://www.invenauto.tech";

	WebElement subjectHeading = this.getDriver().findElement(By.id("id_contact"));
	WebElement email = this.getDriver().findElement(By.id("email"));
	WebElement message = this.getDriver().findElement(By.id("message"));

	public void user_is_on_Contact_Page() {
		this.getDriver().navigate().to(MAIN);	
		this.getDriver().findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
	}

	public void sendEmail() {
		subjectHeading.sendKeys("Customer service");
		email.sendKeys("iAmTheMasterCommander@sharklasers.com");
		message.sendKeys("How may I pay by credit card?  Thanks.");
	}

	public String confirmation() {
		return this.getDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
	}	
}
