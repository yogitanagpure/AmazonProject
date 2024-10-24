package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//features",
        glue = "stepDefinations",
        plugin = { "pretty","html:target/htmlreport.html"}
)
public class TestRunnerTelecom {
}
