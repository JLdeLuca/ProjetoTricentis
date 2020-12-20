package Runner;

import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/"},
		plugin = {	"pretty", "html:target/cucumber-reports",
					"json:target/report/cucumber.json",
					"html:target/report/cucumber.html"},
		snippets = SnippetType.CAMELCASE,
		glue = {"br.com.luca.stepDefinition"},
		monochrome = true,
		tags = "@web"
		)


public class RunnerTest {
	
	static WebDriver driver;
	
	@After
	public static void fechar() {
		driver.quit();
	}

}
