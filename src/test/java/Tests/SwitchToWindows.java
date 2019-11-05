package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.SwitchToWindowsPage;

public class SwitchToWindows extends BaseTest {

	static SwitchToWindowsPage switchToWindowsPage;

	@Test
	public void testAcessarMenuSwitchToWindows() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clicarMenuDemoSite();

		SwitchToWindowsPage switchToWindowsPage = new SwitchToWindowsPage(driver);
		// Chamando o step "Metodo"
		switchToWindowsPage.acessarMenuSwitchToWindows();
		switchToWindowsPage.clicarOpcaoWindows();
		switchToWindowsPage.clicarOpcaoMultileWindows();
		switchToWindowsPage.clicarOpcaoSeparateWindows();
		// switchToAlertsPage.clicarButtonBox();
		// switchToAlertsPage.clicarOpcaoOkCancel();
		// switchToAlertsPage.clicarOpcaoWithOK();
	}

}
