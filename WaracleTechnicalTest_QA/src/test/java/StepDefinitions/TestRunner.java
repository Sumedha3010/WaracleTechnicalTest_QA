package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
					glue = {"StepDefinitions"},
					monochrome = true,
//					tags = "@Register",
					plugin = {"pretty","html:target/HtmlReports" , 
							   "pretty","json:target/jsonReports/cucumber.json" ,
							   "pretty","junit:target/junitReports/cucumber.xml"}

		)

public class TestRunner {

}
