package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Steps {

	WebDriver driver;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.19.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}

	@When("^user inputs name into search product field and press Enter Key$")
	public void user_inputs_name_into_search_field_and_press_Enter_Key() throws Throwable {
		driver.findElement(By.xpath(".//input[@name='s']")).sendKeys("ABCDEF" + Keys.ENTER);
	}
	
	@When("^there is not product with name$")
	public void there_isn_t_product_with_name() throws Throwable {
	}

	@Then("^the message is displayed$")
	public void the_related_product_is_displayed() throws Throwable {
		String expected = "Sorry, but nothing matched your search criteria. Please try again with some different keywords.";
		String actual = driver.findElement(By.xpath("//div[@id='content']/p")).getText();
		Assert.assertEquals(expected, actual);
	}

}
