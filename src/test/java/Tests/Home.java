package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

public class Home {

	static WebDriver driver;
	static HomePage homePage;
	
		@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			// Mostrar onde se encontra o executavél do Chrome
			System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			// Abrindo o Browser
			driver.get("http://automationtesting.in/");
			driver.manage() .window() .maximize();
			
			homePage = new HomePage (driver);
		
	}

	@Test
	public void test() throws InterruptedException {
		    // Chamando os steps
			homePage.clicarMenuDemoSite();

		}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Fechando o Browser
		   driver.close();
		
	}

}