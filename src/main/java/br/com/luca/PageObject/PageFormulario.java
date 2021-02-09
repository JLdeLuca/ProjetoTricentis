package br.com.luca.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.luca.Utils.Utility;

public class PageFormulario {

	private WebDriver driver;

	public PageFormulario(WebDriver driver) {
		this.driver = driver;
	}
	private WebElement selectcp1() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("make"))));
		return el1;
	}

	public void pageForm1() throws InterruptedException {
		selectcp1().sendKeys("Audi");
		selectcp2().sendKeys("Moped");
		inputcp3().sendKeys("8");
		inputcp4().sendKeys("500");
		inputcp5().sendKeys("12/17/2020");
		inputcp6().sendKeys("4");
		Utility.getScreenshot(driver);
		inputcp7().click();
		inputcp8().sendKeys("3");
		inputcp9().sendKeys("Gas");
		inputcp10().sendKeys("500");
		inputcp11().sendKeys("6000");
		inputcp12().sendKeys("80000");
		inputcp13().sendKeys("15000");
		Utility.getScreenshot(driver);
		inputcp15().click();
	}

	public void pageForm2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        form2cp1().sendKeys("Fulano");
        form2cp2().sendKeys("Beltrano");
        form2cp3().sendKeys("04/22/1964");
        form2cp4().sendKeys("Brazil");
        form2cp5().sendKeys("04524001");
        form2cp6().sendKeys("Employee");
        form2cp7().click();
		Utility.getScreenshot(driver);
        form2cp8().click();
        
	}

	public void pageForm3() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        form3cp1().sendKeys("12/17/2021");
        form3cp2().sendKeys("300000");
        form3cp3().sendKeys("Bonus 8");
        form3cp4().sendKeys("Full Coverage");
        form3cp5().click();;
        form3cp6().sendKeys("Yes");
		Utility.getScreenshot(driver);
        form3cp7().click();
        
	}

	public void pageForm4() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        form4cp1().click();
		Utility.getScreenshot(driver);
        form4cp2().click();
        
	}

	public void pageForm5() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        form5cp1().sendKeys("teste@teste.com.br");
        form5cp2().sendKeys("userteste");
        form5cp3().sendKeys("@Teste123");
        form5cp4().sendKeys("@Teste123");
		Utility.getScreenshot(driver);
        form5cp5().click();
        
	}

	private WebElement selectcp2() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("model"))));
		return el1;
	}

	private WebElement inputcp3() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("cylindercapacity"))));
		return el1;
	}

	private WebElement inputcp4() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("engineperformance"))));
		return el1;
	}

	private WebElement inputcp5() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dateofmanufacture"))));
		return el1;
	}

	private WebElement inputcp6() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("numberofseats"))));
		return el1;
	}

	private WebElement inputcp7() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"))));
		return el1;
	}

	private WebElement inputcp8() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("numberofseatsmotorcycle"))));
		return el1;
	}

	private WebElement inputcp9() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("fuel"))));
		return el1;
	}

	private WebElement inputcp10() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("payload"))));
		return el1;
	}

	private WebElement inputcp11() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("totalweight"))));
		return el1;
	}

	private WebElement inputcp12() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("listprice"))));
		return el1;
	}

	private WebElement inputcp13() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("annualmileage"))));
		return el1;
	}

	private WebElement inputcp15() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nextenterinsurantdata"))));
		return el1;
	}
	
	private WebElement form2cp1() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstname"))));
		return el1;
	}

	private WebElement form2cp2() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("lastname"))));
		return el1;
	}

	private WebElement form2cp3() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("birthdate"))));
		return el1;
	}
	private WebElement form2cp4() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("country"))));
		return el1;
	}
	private WebElement form2cp5() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("zipcode"))));
		return el1;
	}
	private WebElement form2cp6() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("occupation"))));
		return el1;
	}
	private WebElement form2cp7() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span"))));
		return el1;
	}
	private WebElement form2cp8() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nextenterproductdata"))));
		return el1;
	}

	private WebElement form3cp1() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("startdate"))));
		return el1;
	}

	private WebElement form3cp2() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("insurancesum"))));
		return el1;
	}

	private WebElement form3cp3() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("meritrating"))));
		return el1;
	}
	private WebElement form3cp4() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("damageinsurance"))));
		return el1;
	}
	private WebElement form3cp5() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"))));
		return el1;
	}
	private WebElement form3cp6() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("courtesycar"))));
		return el1;
	}
	private WebElement form3cp7() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nextselectpriceoption"))));
		return el1;
	}
	private WebElement form4cp1() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span"))));
		return el1;
	} 
	private WebElement form4cp2() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nextsendquote"))));
		return el1;
	} 
	private WebElement form5cp1() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		return el1;
	} 
	private WebElement form5cp2() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		return el1;
	} 
	private WebElement form5cp3() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));
		return el1;
	} 
	private WebElement form5cp4() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("confirmpassword"))));
		return el1;
	} 
	private WebElement form5cp5() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sendemail"))));
		return el1;
	}
	private WebElement botaoOk() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button"))));
		return el1;
	}
	public String pegaMsg() throws InterruptedException {
		WebElement msgFinal = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"));
		Thread.sleep(3000L);
		Utility.getScreenshot(driver);
		botaoOk().click();
		return msgFinal.getText();
	}
	public void fechartudo() throws InterruptedException {
		driver.quit();
	}
	
}
