package Runner;

import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/"},
		plugin = {	"pretty", "html:target/cucumber-reports",
					"json:target/report/cucumber.json",
					"html:target/report/cucumber.html"},
		snippets = SnippetType.CAMELCASE,
		glue = {"br.com.luca.stepDefinition"},
		dryRun = false,
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
