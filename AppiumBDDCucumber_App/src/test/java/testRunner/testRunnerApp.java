package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith (Cucumber.class)
	@CucumberOptions
	(
			features = "C:\\Users\\yogita.hedau\\eclipse-workspace\\AppiumBDDCucumber_App\\Fearures",
			glue = "StepDefinationsNet4MedixApp",
			dryRun = false,
			monochrome = true,
			publish = true				
	)

public class testRunnerApp {
	
}
	
	

