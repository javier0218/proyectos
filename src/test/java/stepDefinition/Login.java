package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	Turno miTurno;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public Login() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

	}

	@Given("^Open browser and start MHO$")
	public void open_browser_and_start_MHO() throws Throwable {

		driver.get("https://intranet.mhc.com.ar/mho_demo/");

	}

	@When("^I enter a valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String username, String password) throws Throwable {

		driver.findElement(By.id("txtLoginUsername")).sendKeys(username);
		driver.findElement(By.id("pwdLoginPassword")).sendKeys(password);
	}

	@Then("^User Should be able to login succesfully$")
	public void user_Should_be_able_to_login_succesfully() throws Throwable {

		driver.findElement(By.xpath("//input[@value='Iniciar Sesion']")).click();

	}

	@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {

		driver.quit();
	}

	@After
	public void TearDown() {
		driver.close();
	}

}
