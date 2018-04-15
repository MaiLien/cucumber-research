package PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPage {
	
	static WebDriver driver;

	static public void openSearchPage() {
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.19.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}

	static public void enterSearchTextAndPressEnterKey(String name) {
		driver.findElement(By.xpath(".//input[@name='s']")).sendKeys(name + Keys.ENTER);
	}

	static public void verifyMessageWhenThereIsNotProduct() {
		String expected = "Sorry, but nothing matched your search criteria. Please try again with some different keywords.";
		String actual = driver.findElement(By.xpath("//div[@id='content']/p")).getText();
		Assert.assertEquals(expected, actual);
		close();
	}
	
	static public void close() {
		driver.close();
	}
	
}
