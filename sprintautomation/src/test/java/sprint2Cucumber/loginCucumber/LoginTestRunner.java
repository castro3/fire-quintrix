package sprint2Cucumber.loginCucumber;

import org.testng.annotations.Test;

import framework.TestBase;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(features = { "src/test/java/sprint2Cucumber/loginCucumber/login.features" }, glue = {
		"src/test/java/sprint2Cucumber/loginCucumber/StepsLogin" }, plugin = { "pretty",
				"json:target/cucumber/cucumber.json" })

public class LoginTestRunner extends TestBase{

    private TestNGCucumberRunner testNGCucumberRunner;
    
	@Test(description = "Runs Cucumber Features", dataProvider = "features")
	public void login(PickleWrapper pickle, FeatureWrapper feature) throws Throwable {
		testNGCucumberRunner.runScenario(pickle.getPickle());
	}

	@BeforeClass
	public void beforeMethod() {
		this.setup();
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@DataProvider(name="features")
	public Object[][] features() {
	    return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass
	public void afterMethod() {
		this.cleanup();
		testNGCucumberRunner.finish();
	}

}
