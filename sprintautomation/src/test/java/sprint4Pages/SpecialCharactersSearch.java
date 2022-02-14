package sprint4Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.AutomationPage;

public class SpecialCharactersSearch extends AutomationPage {

	private String predictionsText;

	public SpecialCharactersSearch(WebDriver driver) {
		super(driver);
	}

	public void searchWithSpecialCharacters() {
		WebElement searchBar = this.driver.findElement(By.xpath(".//input[@name='search_query']"));
		searchBar.sendKeys("Blou$e");
		predictionsText = this.driver.findElement(By.xpath(".//li[@class='ac_even']")).getText();
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public String getProductName() {
		return this.driver.findElement(By.xpath(".//a[@title='Blouse']")).getText();
	}

	public String getSearchPredictions() {
		return this.predictionsText;
	}

}
