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
	public void que_eu_acesse_o_site() {
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
	public void eu_realizar_o_preenchimento_dos_formularios() throws InterruptedException {
		pageFormulario.pageForm1();
		pageFormulario.pageForm2();
		pageFormulario.pageForm3();
	}

	@Quando("^seleciono o preco$")
	public void seleciono_o_preco() throws InterruptedException {
		pageFormulario.pageForm4();
	}

	@Quando("^efetuar o envio das informacoes$")
	public void efetuar_o_envio_das_informacoes() throws InterruptedException {
		pageFormulario.pageForm5();
	}

	@Entao("^eu recebo a mensagem \"([^\"]*)\"$")
	public void eu_recebo_a_mensagem(String arg1) throws Throwable {
//		assertEquals(pageFormulario.pegaMsg(), string);
		pageFormulario.fechartudo();
	}

}
