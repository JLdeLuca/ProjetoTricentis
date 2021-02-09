package br.com.luca.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

public class Utility {

    
	public static String getScreenshot(WebDriver driver) {

	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/target/screenshot/"+System.currentTimeMillis()+".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(scr, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Captura da falha: "+e.getMessage());
		}
		try {
			Reporter.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return path;
		
	}

	public static String pegaHora() {
		return new SimpleDateFormat("HHmmss").format(new Date());
	}
	
	public static String pegaData() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
	}
	
	public static void criarDiretorioMacro(String caminhoDiretorio) {
        try {
            File diretorio = new File(caminhoDiretorio);
            diretorio.mkdir();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o diretorio");
            System.out.println(ex);
        }
    }


}
