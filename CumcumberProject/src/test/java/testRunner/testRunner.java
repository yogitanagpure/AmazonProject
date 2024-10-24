package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith (Cucumber.class)
@CucumberOptions
	(
			features = ".//Features/LoginDemo.feature",
			glue = "stepDefinitions",
			dryRun = false,
			monochrome = true,
			//publish = true
			
			plugin = { "pretty","html:target/htmlreport.html"}	

			//plugin = { "pretty","html:test-output"}			
	)

public class testRunner extends AbstractTestNGCucumberTests {
	
}
