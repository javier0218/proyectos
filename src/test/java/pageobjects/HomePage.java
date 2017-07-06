package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(how = How.XPATH, using = "//i[@class='flaticon-computer167']")
	public static WebElement menu_GestionAdm;

	@FindBy(how = How.XPATH, using = "//div[@class='nav-fixed-left-second']/div/div/div/div[@id='3']/span")
	public static WebElement menu_Turnos;
	
	@FindBy(how = How.XPATH, using = "//div[@id='85']")
	public static WebElement menu_AtencionInmediata;
	
	
	
	

}
