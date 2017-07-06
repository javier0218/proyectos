package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

import static org.testng.Assert.assertTrue;
import cucumber.runtime.junit.Assertions;
import helpers.CommonsMHO;
import helpers.DataHelperMHO;
import pageobjects.BaseClass;
import pageobjects.HomePage;
import pageobjects.TurnPage;

public class TurnActions {

	public static void enter_GestionAdmMenu(WebDriver driver) {

		HomePage.menu_GestionAdm.click();

	}

	public static void enter_Turn(WebDriver driver) {
		HomePage.menu_Turnos.click();
	}

	public static void enterMenu_inmediatteAttention(WebDriver driver) {
		HomePage.menu_AtencionInmediata.click();
	}

	public static void modTurn(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.equals(ExpectedConditions.visibilityOf(TurnPage.input_paciente));

	}

	public static void soliciteTurn(WebDriver driver, List<HashMap<String, String>> map) {

		
		driver.switchTo().frame("fraCentro");

		driver.switchTo().frame("fraListaFiltro");

		driver.switchTo().frame("fraFiltro");

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOf(TurnPage.input_paciente));

		// System.out.println("IDE PACIENTEE" +
		// String.valueOf(map.get(0).get("id")));

		TurnPage.input_paciente.sendKeys(map.get(0).get("identificacion"));

		TurnPage.input_paciente.sendKeys(Keys.ENTER);

		// Salgo de todos los frames
		driver.switchTo().defaultContent();

		driver.switchTo().frame("fraCentro");
		driver.switchTo().frame("fraListView");

		wait.until(ExpectedConditions.visibilityOf(TurnPage.tablaPacientesEcontrados));
		TurnPage.tablaPacientesEcontrados.click();

		// Salgo de todos los frames
		driver.switchTo().defaultContent();

		driver.switchTo().frame("fraCentro");

		driver.switchTo().frame("fraListaFiltro");

		driver.switchTo().frame("fraFiltro");

		wait.until(ExpectedConditions.visibilityOf(TurnPage.input_paciente));

		Select selectProfesional = new Select(TurnPage.select_profesional);

		selectProfesional.selectByVisibleText(map.get(0).get("profesional"));

		Select selectEspecialidad = new Select(TurnPage.select_especialidad);

		selectEspecialidad.selectByVisibleText(map.get(0).get("especialidad"));

		// Salgo de todos los frames
		driver.switchTo().defaultContent();

		driver.switchTo().frame("fraCentro");
		driver.switchTo().frame("fraListView");

		wait.until(ExpectedConditions.visibilityOf(TurnPage.tablaDeTurnos));
		CommonsMHO.IngresaElementoEnTabla(TurnPage.tablaDeTurnos, "Libre");

		driver.switchTo().defaultContent();

		CommonsMHO.handdleAlert(driver);

	}

	public static void press_inmediatteAttention(WebDriver driver, List<HashMap<String, String>> map) {

		driver.switchTo().defaultContent();
		
		System.out.println("PAGE SOURCE----" + driver.getPageSource());

		driver.switchTo().frame("fraToolbar");

		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.equals(ExpectedConditions.visibilityOf(TurnPage.btn_atencionInmentida));

		TurnPage.btn_atencionInmentida.click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("fraCentro");
		driver.switchTo().frame("fraListView");

		wait.until(ExpectedConditions.visibilityOf(TurnPage.tablaDeTurnos));

		String ide_paciente = String.valueOf(map.get(0).get("identificacion"));

		assertTrue(CommonsMHO.BuscarTextosEnTabla(TurnPage.tablaDeTurnos, ide_paciente));

	}

}
