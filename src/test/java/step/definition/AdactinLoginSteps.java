package step.definition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLoginSteps {

	WebDriver driver;

	@Given("user should be in adactin login page")
	public void user_should_be_in_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("user should enter valid {string},{string}")
	public void user_should_enter_valid(String username, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		

	}

	@Then("user should verify the login success message as {string}")
	public void user_should_verify_the_login_success_message_as(String string) {
		String attribute = driver.findElement(By.id("username_show")).getAttribute("value");
		Assert.assertEquals(string, attribute);
		driver.close();
	}
	

	@Then("user should verify the login is not success message contains {string}")
	public void user_should_verify_the_login_is_not_success_message_contains(String string) {
		WebElement errorInvalid = driver.findElement(By.xpath("//b"));
		Assert.assertTrue(errorInvalid.getText().contains(string));
		driver.close();
	}

}
