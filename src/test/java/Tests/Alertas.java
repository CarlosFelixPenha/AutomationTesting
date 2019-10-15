package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AlertasPage;
//import Pages.HomePage;
//import Pages.RegistroPage;

public class Alertas {

	static WebDriver driver;
//	static RegistroPage registroPage;
//	static HomePage homePage;
	static AlertasPage alertasPage;
	
	@BeforeClass
public static void setUpBeforeClass() throws Exception {
		// Mostrar onde se encontra o executavél do Chrome
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Abrindo o Browser
		driver.get("http://automationtesting.in/");
		driver.manage() .window() .maximize();
		// Chamando as paginas
//		homePage = new HomePage (driver);
//		registroPage = new RegistroPage (driver);
		alertasPage = new AlertasPage (driver);
//		homePage.clicarMenuDemoSite();
            
		}

@Test
public void testAcessarMenuWebTable() throws InterruptedException {
	    // Chamando o step "Metodo"
		AlertasPage.();
	}


@AfterClass
public static void tearDownAfterClass() throws Exception {
		// Fechando o Browser
	       driver.close();
}

}
