package helpers;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions
(
		features = "C:\\Users\\yogita.hedau\\Downloads\\Appium-Java-using-PageObjectModel-with-PageFactory-main\\Appium-Java-using-PageObjectModel-with-PageFactory-main\\src\\test\\resources\\features\\Login.feature",
		glue = {"setups" , "Hook"},
		dryRun = false,
		monochrome = true,
		publish = true	
		
)

public class TestRunner {

}
