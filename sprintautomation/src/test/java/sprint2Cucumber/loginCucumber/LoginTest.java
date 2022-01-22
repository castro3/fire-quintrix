package sprint2Cucumber.loginCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/sprint2Cucumber/loginCucumber" }, glue = {
		"src/test/java/sprint2Cucumber/loginCucumber" }, plugin = { "pretty",
				"json:target/cucumber/cucumber.json" })

public class LoginTest extends AbstractTestNGCucumberTests{

}
