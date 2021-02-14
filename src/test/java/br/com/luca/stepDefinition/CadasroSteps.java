package br.com.luca.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.luca.PageObject.PageFormulario;
import br.com.luca.Utils.Utility;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class CadasroSteps {
	
	private PageFormulario pageFormulario;
	private WebDriver driver;


	@Dado("^que eu acesse o site \"([^\"]*)\"$")
	public void queEuAcesseOSite(String url) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver_versao87\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Utility.getScreenshot(driver);
		pageFormulario = new PageFormulario(driver);
	}

	@Quando("^eu realizar o preenchimento dos formularios$")
	public void euRealizarOPreenchimentoDosFormularios() throws InterruptedException, IOException {
		pageFormulario.pageForm1();
		pageFormulario.pageForm2();
		pageFormulario.pageForm3();
	}

	@Quando("^seleciono o preco$")
	public void selecionoOPreco() throws InterruptedException {
		pageFormulario.pageForm4();
	}

	@Quando("^efetuo o envio das informacoes$")
	public void efetuarOEnvioDasInformacoes() throws InterruptedException  {
		pageFormulario.pageForm5();

	}

	@Entao("^eu recebo a mensagem \"([^\"]*)\"$")
	public void euReceboAMensagem(String string) throws InterruptedException  {
		assertEquals(pageFormulario.pegaMsg(), string);
		pageFormulario.fechartudo();
	}

}

