package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.RegistroPage;

public class Registro {
	
	static WebDriver driver;
	static RegistroPage registroPage;
	static HomePage homePage;
	
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
			registroPage = new RegistroPage (driver);
			homePage.clicarMenuDemoSite();
                
			}

	@Test
	public void testEditarCampoFirstName() throws InterruptedException {
		    // Chamando o step "Metodo"
			registroPage.editarCampoFirstName();
			registroPage.editarCampoLastName();
			registroPage.editarCampoAddress();
			registroPage.editarCampoEmailAddress();
			registroPage.editarCampoPhone();
			registroPage.editarCampoGender();
//			registroPage.editarCampoCountry();
			registroPage.entrarComPais();
//			registroPage.editarCampoYear();
			registroPage.entrarComAno();
//			registroPage.editarCampoMonth();
			registroPage.entrarComMes();
//			registroPage.editarCampoDay();
			registroPage.entrarComDia();
			registroPage.editarCampoPassword();
			registroPage.editarCampoConfirmPassword();
			registroPage.clicarBotaoSubmit();
			
		}
	
//	@Test
//	public void testEditarCampoLastName() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoLastName();
//		}
//	
//	@Test
//	public void testEditarCampoAddress() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoAddress();
//		}
//	
//	@Test
//	public void testEditarCampoEmailAddress() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoEmailAddress();
//		}
//	
//	@Test
//	public void testEditarCampoPhone() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoPhone();
//		}
//	
//	@Test
//	public void testEditarCampoGender() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoGender();
//		}
//	
//	@Test
//	public void testEditarCampoCountry() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoCountry();
//		}
//	
//	@Test
//	public void testEntrarComPais() throws InterruptedException {
//		    // Chamando o step
//			registroPage.entrarComPais();
//		}
//	
//	@Test
//	public void testEditarCampoYear() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoYear();
//		}
//	
//	@Test
//	public void testEntrarComAno() throws InterruptedException {
//		    // Chamando o step
//			registroPage.entrarComAno();
//		}
//	
//	@Test
//	public void testEditarCampoMonth() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoMonth();
//		}
//	
//	@Test
//	public void testEntrarComMes() throws InterruptedException {
//		    // Chamando o step
//			registroPage.entrarComMes();
//		}
//	
//	@Test
//	public void testEditarCampoDay() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoDay();
//		}
//	
//	@Test
//	public void testEntrarComDia() throws InterruptedException {
//		    // Chamando o step
//			registroPage.entrarComDia();
//		}
//	
//	@Test
//	public void testEditarCampoPassword() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoPassword();
//		}
//	
//	@Test
//	public void testEditarCampoConfirmPassword() throws InterruptedException {
//		    // Chamando o step
//			registroPage.editarCampoConfirmPassword();
//		}
//	
//	@Test
//	public void testclicarBotaoSubmit() throws InterruptedException {
//		    // Chamando o step
//			registroPage.clicarBotaoSubmit();
//		}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
			// Fechando o Browser
//		       driver.close();
	}
}
