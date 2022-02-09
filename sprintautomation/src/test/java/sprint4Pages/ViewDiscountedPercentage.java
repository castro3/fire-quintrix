package sprint4Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AutomationPage;

public class ViewDiscountedPercentage extends AutomationPage{

	public ViewDiscountedPercentage(WebDriver driver) {
		super(driver);
	}
	
	public ViewDiscountedPercentage goToSpecials() {
		this.driver.findElement(By.cssSelector("a[class='blockspecials']")).click();
		return this;
	}
	
	public String getDiscountedPercentage() {
		return this.driver.findElement(By.xpath(".//li[@class='ajax_block_product "
				+ "col-xs-12 col-sm-4 col-md-3 last-line last-item-of-mobile-line last-mobile-line']"
				+ "//div//div[@class='right-block']//div[@class='content_price']"
				+ "//span[@class='price-percent-reduction']")).getText();
	}
}
