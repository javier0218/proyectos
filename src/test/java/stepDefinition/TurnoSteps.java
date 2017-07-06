package stepDefinition;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelperMHO;
import modules.TurnActions;
import pageobjects.HomePage;
import pageobjects.TurnPage;

public class TurnoSteps {

	WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public TurnoSteps() {

		// Llamo el Hooks
		driver = Hooks.driver;
		datamap = DataHelperMHO.data();

	}

	@When("^I enter Administrative Management$")
	public void i_enter_Administrative_Management() throws Throwable {

		PageFactory.initElements(driver, HomePage.class);
		TurnActions.enter_GestionAdmMenu(driver);

	}

	@When("^I enter Module Turn$")
	public void i_enter_Module_turn() throws Throwable {

		PageFactory.initElements(driver, HomePage.class);
		TurnActions.enter_Turn(driver);
	}

	@Then("^The module turn open succesfully$")
	public void the_module_turn_open_succesfully() throws Throwable {

		PageFactory.initElements(driver, TurnPage.class);

		TurnActions.modTurn(driver);

	}

	@When("^I request a turn with a profesional$")
	public void i_request_a_turn_with_a_profesional() throws Throwable {

		PageFactory.initElements(driver, TurnPage.class);

		TurnActions.soliciteTurn(driver, datamap);

	}

	@When("^I enter Module Inmediate Attention$")
	public void i_enter_Module_Inmediate_Attention() throws Throwable {

		PageFactory.initElements(driver, TurnPage.class);
		TurnActions.enterMenu_inmediatteAttention(driver);
		;

	}

	@Then("^The shift is assigned succesfully$")
	public void the_shift_is_assigned_succesfully() throws Throwable {

	}

	@Then("^The Inmediate Attention is assigned succesfully$")
	public void the_Inmediate_Attention_is_assigned_succesfully() throws Throwable {

		PageFactory.initElements(driver, TurnPage.class);
		TurnActions.press_inmediatteAttention(driver, datamap);

	}

}
