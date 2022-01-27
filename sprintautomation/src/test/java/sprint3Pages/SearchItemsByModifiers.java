package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class SearchItemsByModifiers extends AutomationPage {

	public SearchItemsByModifiers(WebDriver driver) {
		super(driver);
	}

	public void searchByKeyword() {
		WebElement search = this.driver.findElement(By.xpath(".//input[@name='search_query']"));
		search.sendKeys("Printed");
		search.sendKeys(Keys.ENTER);
	}

	public String getProductTitle() {
		return this.driver.findElement(By.xpath(".//a[@title='Printed Dress']")).getText();
	}

	public void searchByCategory() {
		this.driver.findElement(By.xpath(".//a[@title='Women']")).click();
	}

	public String getWomanCategoryText() {
		return this.driver.findElement(By.xpath("//div[@class='rte']")).getText();
	}

	public void searchBySortBy() {
		searchByCategory();
		this.driver.findElement(By.xpath(".//"));
	}

	public String getLowestPrice() {
		return this.driver.findElement(By.xpath(".//a[@title='Printed Dress']")).getText();
	}

	public void searchBySubCategory() {

	}

	public String getTopsSubCategoryText() {
		return this.driver.findElement(By.xpath(".//a[@title='Printed Dress']")).getText();
	}

	public void searchByFilter() {

	}

	public String getColorFromProduct() {
		return this.driver.findElement(By.xpath(".//a[@title='Printed Dress']")).getText();
	}

}
