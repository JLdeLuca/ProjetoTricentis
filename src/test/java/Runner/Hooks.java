package Runner;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class Hooks {
	
	WebDriver driver;
	
	@AfterClass
	public void TeaDown() {
		driver.quit();
	}
	

}
