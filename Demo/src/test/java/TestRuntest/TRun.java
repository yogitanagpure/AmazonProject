package TestRuntest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = ".//feat//amazon",
		features= "C:\\Users\\yogita.hedau\\eclipse-workspace\\Demo\\Feat\\amazon.feature",
        glue = "TestStep",
        plugin = { "pretty","html:target/htmlreport.html"}
)

public class TRun {

}
