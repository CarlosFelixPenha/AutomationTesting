package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static WebDriver driver;

	@Before
	public void before() {
		// Mostrar onde se encontra o executavél do Chrome
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Abrindo o Browser
		driver.get("http://automationtesting.in/");
		driver.manage().window().maximize();

	}

	@After
	public void tearDownAfterClass() {
		// Fechando o Browser
		driver.close();
	}
}
