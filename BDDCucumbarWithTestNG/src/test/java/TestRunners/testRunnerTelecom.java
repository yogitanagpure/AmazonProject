package TestRunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith (Cucumber.class)

@CucumberOptions
	(
			features = ".//Features",
			glue = "stepDefinitions",
			plugin = { "pretty","html:target/htmlreport.html"}	

			//plugin = { "pretty","html:test-output"}			
	)

public class testRunnerTelecom extends AbstractTestNGCucumberTests {
	
}