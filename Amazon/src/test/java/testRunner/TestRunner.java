package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features",
    glue = {"stepDefination"},
    //plugin = {"pretty", "html:target/cucumber-reports"},
    plugin = { "pretty","html:target/htmlreport.html"},
    monochrome = true
)
public class TestRunner {
}