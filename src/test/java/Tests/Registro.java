package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.RegistroPage;

public class Registro extends BaseTest {

	@Test
	public void testEditarCampoFirstName() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clicarMenuDemoSite();

		RegistroPage registroPage = new RegistroPage(driver);
		// Chamando o step "Metodo"
		registroPage.editarCampoFirstName();
		registroPage.editarCampoLastName();
		registroPage.editarCampoAddress();
		registroPage.editarCampoEmailAddress();
		registroPage.editarCampoPhone();
		registroPage.editarCampoGender();
		// registroPage.editarCampoCountry();
		registroPage.entrarComPais();
		// registroPage.editarCampoYear();
		registroPage.entrarComAno();
		// registroPage.editarCampoMonth();
		registroPage.entrarComMes();
		// registroPage.editarCampoDay();
		registroPage.entrarComDia();
		registroPage.editarCampoPassword();
		registroPage.editarCampoConfirmPassword();
		registroPage.clicarBotaoSubmit();

	}

}
