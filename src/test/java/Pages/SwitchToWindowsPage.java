package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwitchToWindowsPage {

	static WebDriver driver;

	public SwitchToWindowsPage(WebDriver driver) {
		SwitchToWindowsPage.driver = driver;
	}

	public void acessarMenuSwitchToWindows() throws InterruptedException {
		// Mouse Over
		WebElement menuSwitchToWindows = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(menuSwitchToWindows).perform();
		Thread.sleep(2000);
	}

	public void clicarOpcaoWindows() throws InterruptedException {
		WebElement opcaoWindows = driver
				.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a"));
		opcaoWindows.click();
		Thread.sleep(1000);
	}

	public void clicarOpcaoMultileWindows() throws InterruptedException {
		WebElement opcaoMultipleWindows = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		opcaoMultipleWindows.click();
		Thread.sleep(1000);
	}

	public void clicarOpcaoSeparateWindows() throws InterruptedException {
		WebElement opcaoSeparateWindows = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		opcaoSeparateWindows.click();
		Thread.sleep(1000);
	}
}