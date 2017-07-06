package stepDefinition;

import java.util.HashMap;
import java.util.List;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelperMHO;
import modules.LoginInAction;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginSteps {

	WebDriver driver;

	public List<HashMap<String, String>> datamap;

	public LoginSteps() {

		// Llamo el Hooks
		driver = Hooks.driver;
		datamap = DataHelperMHO.data();

	}

	@Given("^Open browser and start MHO$")
	public void open_browser_and_start_MHO() throws Throwable {

		driver.get("https://intranet.mhc.com.ar/mho_demo/");

	}

	@When("^I Sign in Application$")
	public void i_Sign_in_Application() throws Throwable {
		PageFactory.initElements(driver, LoginPage.class);

		PageFactory.initElements(driver, HomePage.class);
		LoginInAction.loginExecute(driver, datamap);
	}

	@Then("^User Should be able to login succesfully$")
	public void user_Should_be_able_to_login_succesfully() throws Throwable {

	}

}
