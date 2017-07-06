package helpers;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BaseClass;

public class CommonsMHO extends BaseClass {

	public CommonsMHO(WebDriver driver) {
		super(driver);

	}

	public static Boolean BuscarTextosEnTabla(WebElement Elemento, String text) {
		List<WebElement> filas = Elemento.findElements(By.xpath("//tbody/tr/td"));
		for (WebElement fila : filas) {
			if (fila.getText().contains(text)) {
				return true;
			}
		}
		return false;
	}

	public static Boolean IngresaElementoEnTabla(WebElement Elemento, String text) {
		List<WebElement> filas = Elemento.findElements(By.xpath("//tbody/tr/td/span"));
		for (WebElement fila : filas) {
			if (fila.getText().contains(text)) {
				fila.click();
				break;
			}
		}
		return false;
	}

	public static boolean handdleAlert(WebDriver driver) {

		// wait.until(ExpectedConditions.alertIsPresent());
		boolean presentFlag = false;

		if (isAlertPresent(driver)) {

			try {

				// Check the presence of alert
				Alert alert = driver.switchTo().alert();
				// Alert present; set the flag
				presentFlag = true;
				// if present consume the alert
				alert.accept();
				// ( Now, click on ok or cancel button )

			} catch (NoAlertPresentException ex) {
				// Alert not present
				ex.printStackTrace();
			}
		}

		return presentFlag;

	}

	public static boolean isAlertPresent(WebDriver driver) {
		try {

			driver.switchTo().alert();

			return true;

		} catch (NoAlertPresentException e) {
			return false;
		}

	}

}
