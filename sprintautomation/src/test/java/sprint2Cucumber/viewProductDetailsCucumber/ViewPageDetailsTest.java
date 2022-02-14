package sprint2Cucumber.viewProductDetailsCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/sprint2Cucumber/viewProductDetailsCucumber" }, plugin = { "pretty",
				"json:target/cucumber/cucumber.json" })

public class ViewPageDetailsTest extends AbstractTestNGCucumberTests{

}
