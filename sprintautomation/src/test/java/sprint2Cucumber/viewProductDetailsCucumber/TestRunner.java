package sprint2Cucumber.viewProductDetailsCucumber;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/test/sprint2Cucumber.viewProductDetailsCucumber/ViewPageDetails.feature",
        glue = {"src/main/sprint2Cucumber.viewProductDetailsCucumber/CucumberViewPageDetails.java"}
        )

public class TestRunner {
  @Test
  public void features() {
	  
  }
}
