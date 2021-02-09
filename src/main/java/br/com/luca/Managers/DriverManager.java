package br.com.luca.Managers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import br.com.luca.Enums.DriverType;
import br.com.luca.Enums.EnvironmentType;
import br.com.luca.Utils.Constant;;

public class DriverManager {

	private WebDriver driver;
	private DriverType driverType;
	private EnvironmentType environmentType;

	public DriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	}

	public WebDriver getDriver() throws Exception {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() throws Exception {
		switch (environmentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case REMOTO:
			driver = createRemoteDriver();
			break;
		}
		return driver;
	}

	private WebDriver createRemoteDriver() throws MalformedURLException {
		driver = new RemoteWebDriver(new URL(Constant.UrlServidor), DesiredCapabilities.firefox());
		((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		return driver;
	}

	private WebDriver createLocalDriver() throws Exception {
		switch (driverType) {
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			System.setProperty("http.proxyUser", "d65485");
			System.setProperty("http.proxyPassword", "Cardif@brasil2020");
			System.setProperty("https.proxyUser", "d65485");
			System.setProperty("https.proxyPassword", "Cardif@brasil2020");
			File pathBinary = new File("C:\\Program Files (x86)\\Mozilla\\Firefox\\firefox.exe");

			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
			DesiredCapabilities desired = DesiredCapabilities.firefox();
			FirefoxOptions options = new FirefoxOptions();
			desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
			desired.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();

			break;
		case CHROME:

			
			break;
		default:
			break;
		}
		return driver;
	}

	public void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
		

}