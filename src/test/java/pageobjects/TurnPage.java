package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class TurnPage extends BaseClass {

	public TurnPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(how = How.XPATH, using = "//iframe[@id='fraCentro']")
	public static WebElement frame_Descripcion;

	@FindBy(how = How.ID, using = "fraListaFiltro")
	public static List<WebElement> lista_Filtro;

	@FindBy(how = How.ID, using = "txtDescripcion_control")
	public static WebElement input_paciente;

	@FindBy(how = How.ID, using = "cboProf")
	public static WebElement select_profesional;

	@FindBy(how = How.ID, using = "cboEsp")
	public static WebElement select_especialidad;

	@FindBy(how = How.XPATH, using = "//div[@id='ext-gen20']/div/table")
	public static WebElement tablaPacientesEcontrados;
		
	@FindBy(how = How.XPATH, using = "//table[@id='tableTurnos']/tbody/tr/td/table")
	public static WebElement tablaDeTurnos;
	
	@FindBy(how=How.ID, using="ext-gen11")
	public static WebElement btn_atencionInmentida;
	
	
	
	

	
	

}
