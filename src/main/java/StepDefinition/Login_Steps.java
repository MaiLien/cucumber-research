package StepDefinition;

import java.util.List;

import DataTable.Credentials;
import PageObject.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Steps {

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		LoginPage.openHomePage();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		LoginPage.openLoginPage();
	}
	
	//@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(DataTable users) throws Throwable {
		LoginPage.enterUsernameAndPassword(users);
	}

	//Data Table maps Object Class
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser__and_Test(List<Credentials> users) throws Throwable {
		LoginPage.enterUsernameAndPassword(users);
	}
	
	@Then("^Error message is displayed$")
	public void verifyErrorMessageIsDisplay() throws Throwable {
		LoginPage.verifyErrorMessageWhenLoginFail();
	}

}
