package toolsqa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Feature/CucumberTag.feature" }, glue = { "StepDefinition" }, monochrome = true, tags = { "@SmokeTest" })
public class RunCucumberTagTest {

}
