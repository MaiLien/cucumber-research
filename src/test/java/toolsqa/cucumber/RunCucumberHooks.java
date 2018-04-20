package toolsqa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Feature/CucumberHooks.feature" }, glue = { "StepDefinition", "Hooks" }, monochrome = true, tags= { "@First" })
public class RunCucumberHooks {

}
