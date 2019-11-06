package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.WidgetsAccordionPage;

public class WidgetsAccordion extends BaseTest {

	static WidgetsAccordionPage widgetsAccordionPage;

	@Test
	public void testAcessarMenuWidgetsAccordion() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clicarMenuDemoSite();

		WidgetsAccordionPage widgetsAccordionPage = new WidgetsAccordionPage(driver);
		// Chamando o step "Metodo"
		widgetsAccordionPage.acessarMenuWidgetsAccordion();
		widgetsAccordionPage.clicarOpcaoAccordion();
		widgetsAccordionPage.clicarCollapsible2();
		widgetsAccordionPage.clicarCollapsible3();
		widgetsAccordionPage.clicarCollapsible4();
		widgetsAccordionPage.clicarCollapsible1();
		widgetsAccordionPage.clicarCollapsible2a();
		widgetsAccordionPage.clicarCollapsible3a();
		widgetsAccordionPage.clicarCollapsible4a();
	}

}
