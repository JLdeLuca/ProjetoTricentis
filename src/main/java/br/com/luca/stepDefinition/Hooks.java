package br.com.luca.stepDefinition;


import org.junit.After;
import org.openqa.selenium.WebDriver;



public class Hooks {
	
	WebDriver driver;
	
	@After
	public void TeaDown() {
		driver.quit();
	}
	

}
