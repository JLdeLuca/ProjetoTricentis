package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.luca.Managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/" }, plugin = { "pretty", "html:target/cucumber-reports",
		"json:target/report/cucumber.json", "html:target/report/cucumber.html",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
//		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/relatorio.html" },

		snippets = SnippetType.CAMELCASE, glue = { "br.com.luca.stepDefinition" }, monochrome = true, tags = "@web")

public class RunnerTest {

 @AfterClass
 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
     Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.7.0");
     Reporter.setSystemInfo("Maven", "3.5.2");
     Reporter.setSystemInfo("Java Version", "1.8.0_151");
 }
  
}
