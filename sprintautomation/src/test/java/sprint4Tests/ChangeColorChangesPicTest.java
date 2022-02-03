package sprint4Tests;

import org.testng.annotations.Test;
import framework.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ChangeColorChangesPicTest extends TestBase{

	@BeforeTest
	public void beforeTest() {
		this.setup();
	}
	
	@Test
	public void productImageChangesUponClickingColor() {
		
	}

	@AfterTest
	public void afterTest() {
		this.cleanup();
	}

}
