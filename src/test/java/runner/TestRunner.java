package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
glue = { "stepDefinition" },
//tags={"@login","@TurnAdm"},
plugin = { "html:reportes/cucumber-html-report-jefry" })
public class TestRunner {
	
	
	
	

	
	
	

}
