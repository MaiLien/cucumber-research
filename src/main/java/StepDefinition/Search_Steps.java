package StepDefinition;

import PageObject.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Steps {

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		SearchPage.openSearchPage();
	}

	//Basic cucumber
	@When("^user inputs name into search product field and press Enter Key$")
	public void user_inputs_name_into_search_field_and_press_Enter_Key() throws Throwable {
		SearchPage.enterSearchTextAndPressEnterKey("ABCDFE");
	}
	
	//Parameterization
	@When("^user inputs \"(.*)\" into search product field and press Enter Key$")
	public void user_inputs_name_into_search_field_and_press_Enter_Key_UsingParameterization(String name) throws Throwable {
		SearchPage.enterSearchTextAndPressEnterKey(name);
	}
	
	@When("^there is not product with name$")
	public void there_isn_t_product_with_name() throws Throwable {
	}

	@Then("^the message is displayed$")
	public void the_related_product_is_displayed() throws Throwable {
		SearchPage.verifyMessageWhenThereIsNotProduct();
	}

}
