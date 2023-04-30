package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// runner class we write the code after the package & before the class

// How do configure testNg with Cucumber?
// How to run runner class? 
@CucumberOptions(
		// plugin is nothing but generate the report
		plugin= {"pretty","json:target/cucumber.json" }, 
		features = { ".//Features/" }, // feature is nothing but location of features file
		glue = { "smarttech.ny.stepdefinations" } // glue is nothing but location of stepdefination
)
public class TestRunner extends AbstractTestNGCucumberTests {

}