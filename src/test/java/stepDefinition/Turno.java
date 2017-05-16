package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Turno {

	WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("^I enter Administrative Management$")
	public void i_enter_Administrative_Management() throws Throwable {

		WebElement btnAdmManagment = driver.findElement(By.xpath("//i[@class='flaticon-computer167']"));
		Thread.sleep(10);
		btnAdmManagment.click();

	}

	@When("^I enter Module Turn$")
	public void i_enter_Module_turn() throws Throwable {

		WebElement btnTurn = driver
				.findElement(By.xpath("//div[@class='nav-fixed-left-second']/div/div/div/div[@id='3']/span"));
		Thread.sleep(10);
		btnTurn.click();

	}

	@After
	public void TearDown() {
		driver.close();
	}

}
