package br.com.luca.stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.luca.PageObject.PageFormulario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class CadasroSteps {
	
	static WebDriver driver;
	private PageFormulario pageFormulario;


	@Dado("que eu acesse o site")
	public void que_eu_acesse_o_site() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "D:\\Java_Geral\\Desafio_accenture\\ProjetoTricentis\\src\\test\\resources\\Driver_versao87");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		pageFormulario = new PageFormulario(driver);
	}

	@Quando("eu realizar o preenchimento dos formularios")
	public void eu_realizar_o_preenchimento_dos_formularios() throws InterruptedException {
		pageFormulario.pageForm1();
		pageFormulario.pageForm2();
		pageFormulario.pageForm3();
	}

	@Quando("seleciono o preco")
	public void seleciono_o_preco() throws InterruptedException {
		pageFormulario.pageForm4();
	}

	
	@Quando("efetuar o envio das informacoes")
	public void efetuar_o_envio_das_informacoes() throws InterruptedException {
		pageFormulario.pageForm5();
	}

	@Entao("eu recebo a mensagem {string}")
	public void eu_recebo_a_mensagem(String string) {
		String msgFinal = null;
		assertEquals(pageFormulario.pegaMsg(msgFinal), string);
	}

}
