package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(how = How.ID, using = "txtLoginUsername")
	public static WebElement login;

	@FindBy(how = How.ID, using = "pwdLoginPassword")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@value='Iniciar Sesion']")
	public static WebElement btnLogin;
	
	
	

	
	
	

}
