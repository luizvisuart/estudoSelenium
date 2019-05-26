package cursoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class testeGoogle {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "/Users/Luiz/Documents/selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		driver.manage().window().setSize(new Dimension(900, 550)); // escolhendo o tamanho da tela
		driver.manage().window().maximize(); // começando a tela maximizada
		
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}

}
