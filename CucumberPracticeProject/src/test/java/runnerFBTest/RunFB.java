package runnerFBTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
			features = "src/test/resources/Features",
			glue = "FacebookSteps",
			dryRun = false,
			monochrome = true,
			//publish = true
			
			plugin = { "pretty","html:target/htmlreport.html"}	

			//plugin = { "pretty","html:test-output"}			
	)
public class RunFB extends AbstractTestNGCucumberTests {

}
