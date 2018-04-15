package toolsqa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Feature\\Search_ParameterizationUsingExamplesKeyword.feature"}, glue = { "StepDefinition" }, plugin={"html:C:\\Users\\lien\\Desktop\\ReportCucumber"}, monochrome=true, dryRun=false)

public class TestRunner {

}
