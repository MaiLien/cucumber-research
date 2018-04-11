package toolsqa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "StepDefinition" }, format={"html:C:\\Users\\lien\\Desktop\\JsonRequest"}, monochrome=true, dryRun=false)

public class TestRunner {

}
	