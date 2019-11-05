package Tests;

import org.junit.Test;

import Pages.HomePage;

public class Home extends BaseTest {

	@Test
	public void test() throws InterruptedException {
		// estanciando driver
		HomePage homePage = new HomePage(driver);
		// Chamando os steps
		homePage.clicarMenuDemoSite();
	}

}