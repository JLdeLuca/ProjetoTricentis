package br.com.luca.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.luca.PageObject.PageFormulario;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class CadasroSteps {
	
	static WebDriver driver;
	private PageFormulario pageFormulario;

	@Dado("^que eu acesse o site$")
	public void queEuAcesseOSite()  {
		String path = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver", path.concat("\\src\\test\\esources\\Driver_versao87\\Chromedriver.exe"));
		System.out.println(path.concat("\\src\\test\\resources\\Driver_versao87\\Chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		pageFormulario = new PageFormulario(driver);
	}

	@Quando("^eu realizar o preenchimento dos formularios$")
	public void euRealizarOPreenchimentoDosFormularios() throws InterruptedException {
		pageFormulario.pageForm1();
		pageFormulario.pageForm2();
		pageFormulario.pageForm3();
	}

	@Quando("^seleciono o preco$")
	public void selecionoOPreco() throws InterruptedException {
		pageFormulario.pageForm4();
	}

	@Quando("^efetuar o envio das informacoes$")
	public void efetuarOEnvioDasInformacoes() throws InterruptedException  {
		pageFormulario.pageForm5();

	}

	@Entao("^eu recebo a mensagem \"([^\"]*)\"$")
	public void euReceboAMensagem(String arg1) throws InterruptedException  {
//		assertEquals(pageFormulario.pegaMsg(), string);
		pageFormulario.fechartudo();
	}

}
