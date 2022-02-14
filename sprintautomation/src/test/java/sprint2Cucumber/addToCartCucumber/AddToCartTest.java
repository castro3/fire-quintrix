package sprint2Cucumber.addToCartCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/sprint2Cucumber/addToCartCucumber" }, plugin = { "pretty",
				"json:target/cucumber/cucumber.json" })

public class AddToCartTest extends AbstractTestNGCucumberTests{

}