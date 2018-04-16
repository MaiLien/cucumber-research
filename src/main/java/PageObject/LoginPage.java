package PageObject;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataTable.Credentials;
import cucumber.api.DataTable;

public class LoginPage {

	static WebDriver driver;

	public static void openHomePage() {
		System.setProperty("webdriver.gecko.driver", ".\\gecko\\v0.19.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
	}

	public static void openLoginPage() {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}

	// Data Tables
	public static void enterUsernameAndPassword(DataTable usercredentials) throws InterruptedException {
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class)) {
			driver.findElement(By.id("log")).clear();
			driver.findElement(By.id("log")).sendKeys(data.get("Username"));
			driver.findElement(By.id("pwd")).clear();
			driver.findElement(By.id("pwd")).sendKeys(data.get("Password"));
			driver.findElement(By.id("login")).click();
			Thread.sleep(3000);
		}
	}

	// Data Table uses Object Class
	public static void enterUsernameAndPassword(List<Credentials> usercredentials) throws InterruptedException {
		for (Credentials credentials : usercredentials) {
			driver.findElement(By.id("log")).clear();
			driver.findElement(By.id("log")).sendKeys(credentials.getUsername());
			driver.findElement(By.id("pwd")).clear();
			driver.findElement(By.id("pwd")).sendKeys(credentials.getPassword());
			driver.findElement(By.id("login")).click();
			Thread.sleep(3000);
		}
	}

	static public void verifyErrorMessageWhenLoginFail() {
		String expected = "ERROR: The password you entered for the username testuser_2 is incorrect. Lost your password?";
		String actual = driver.findElement(By.xpath("//div[@id='login_form']//p")).getAttribute("textContent");
		Assert.assertEquals(expected, actual);
		close();
	}

	static public void close() {
		driver.close();
	}

}
