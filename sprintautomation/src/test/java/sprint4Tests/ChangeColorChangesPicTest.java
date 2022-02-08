package sprint4Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import sprint4Pages.ChangeColorChangesPic;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ChangeColorChangesPicTest extends TestBase{

	ChangeColorChangesPic colors;
	
	@BeforeTest
	public void beforeTest() {
		this.setup();
		colors = new ChangeColorChangesPic(this.getDriver());
	}
	
	@Test
	public void productImageChangesUponClickingColor() {
		colors.navigateToProductPage();
		colors.clickOnBlue();
		String blueSource = colors.selectedImage();
		colors.clickOnOrange();
		String orangeSource = colors.selectedImage();
		
		Assert.assertNotEquals(blueSource, orangeSource);
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

}
