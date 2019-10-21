package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.HomePage;
import Pages.SwitchToAlertsPage;

public class SwitchToAlerts {

	static WebDriver driver;
	static HomePage homePage;
	static SwitchToAlertsPage switchToAlertsPage;
	
	@BeforeClass
public static void setUpBeforeClass() throws Exception {
		// Mostrar onde se encontra o executavél do Chrome
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Abrindo o Browser
		driver.get("http://automationtesting.in/");
		driver.manage() .window() .maximize();
		// Chamando as paginas
		homePage = new HomePage (driver);
		switchToAlertsPage = new SwitchToAlertsPage (driver);
		homePage.clicarMenuDemoSite();
            
		}

@Test
public void testAcessarMenuWebTable() throws InterruptedException {
	    // Chamando o step "Metodo"
		switchToAlertsPage.acessarMenuSwitchTo();
	}


@AfterClass
public static void tearDownAfterClass() throws Exception {
		// Fechando o Browser
	       driver.close();
}

}
