package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;


import pageobjects.LoginPage;

public class LoginInAction {

	public static void loginExecute(WebDriver driver, List<HashMap<String, String>> map) {

		LoginPage.login.sendKeys(map.get(0).get("username"));

		LoginPage.password.sendKeys(map.get(0).get("password"));

		LoginPage.btnLogin.click();

	}

}
