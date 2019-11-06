package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.SwitchToAlertsPage;

public class SwitchToAlerts extends BaseTest {

	@Test
	public void testAcessarMenuSwitchToAlerts() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clicarMenuDemoSite();

		SwitchToAlertsPage switchToAlertsPage = new SwitchToAlertsPage(driver);
		// Chamando o step "Metodo"
		switchToAlertsPage.acessarMenuMoreModals();
		switchToAlertsPage.clicarOpcaoModals();
		switchToAlertsPage.clicarBotaoModal();
//		switchToAlertsPage.clicarBotaoSave();
		switchToAlertsPage.acessarMenuSwitchToAlerts();
		switchToAlertsPage.clicarOpcaoAlerts();
		switchToAlertsPage.clicarOpcaoTextBox();
		switchToAlertsPage.clicarButtonBox();
		switchToAlertsPage.clicarOpcaoOkCancel();
		switchToAlertsPage.clicarOpcaoWithOK();
	}

}
