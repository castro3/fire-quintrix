package sprint3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import framework.AutomationPage;

public class SearchItemsByModifiers extends AutomationPage {
	public Select sortSelect;

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
		sortSelect = new Select(this.driver.findElement(By.xpath(".//select[@id='selectProductSort']")));
		sortSelect.selectByValue("price:asc");
		
	}

	public String getSortSelected() {
		return sortSelect.getFirstSelectedOption().getText();
	}

	public void searchBySubCategory() {
		searchByCategory();
		this.driver.findElement(By.xpath(".//img[@alt='Tops']")).click();
	}

	public String getTopsSubCategoryText() {
		return this.driver.findElement(By.xpath("//div[@class='rte']")).getText();
	}

	public void searchByFilter() {
		searchByCategory();
		this.driver.findElement(By.xpath(".//label[@name='layered_id_attribute_group_11']//a")).click();
	}

	public String getColorSelected() {
		return this.driver.findElement(By.xpath(".//input[@name='layered_id_attribute_group_11']")).getAttribute("style");
	}

}
