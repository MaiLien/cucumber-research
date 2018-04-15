package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.mockito.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	WebDriver driver;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.19.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");
	}

	@When("^user inputs \"(.*)\" into search field and press Enter Key$")
	public void user_inputs_product_name_into_search_field_and_press_Enter_Key(String product_name) {
		driver.findElement(By.xpath(".//input[@name='s']")).sendKeys(product_name + Keys.ENTER);
	}

	@Then("^the related product is displayed$")
	public void the_related_product_is_displayed() {
		List<WebElement> results = driver.findElements(
				By.xpath("div[@id='grid_view_products_page_container']//div[@class='product_grid_item']//div[@class='grid_product_info']"));
		for (int i = 0; i < results.size(); i++) {
			String actualText = results.get(i).getText();
			System.out.println(actualText);
			System.out.println(actualText.contains("Iphone"));
			Assert.assertTrue(actualText.contains("Iphone"));
		}
		
	}

}
