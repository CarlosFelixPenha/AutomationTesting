package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwitchToAlertsPage {

	static WebDriver driver;

	public SwitchToAlertsPage(WebDriver driver) {
		SwitchToAlertsPage.driver = driver;
	}

	public void acessarMenuMoreModals() throws InterruptedException {
		// Mouse Over
		WebElement menuMoreModals = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[9]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(menuMoreModals).perform();
		Thread.sleep(1000);
	}

	public void clicarOpcaoModals() throws InterruptedException {
		WebElement opcaoModals = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[7]/a"));
		opcaoModals.click();
		Thread.sleep(1000);
	}

	public void clicarBotaoModal() throws InterruptedException {
		WebElement botaoModal = driver.findElement(By.xpath("/html/body/section/div[1]/div[1]/div/div[2]/a"));
		botaoModal.click();
		Thread.sleep(1000);
	}
	
	public void clicarBotaoModal2() throws InterruptedException {
		WebElement botaoModal2 = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]"));
		botaoModal2.click();
		Thread.sleep(1000);
	}

	public void acessarMenuSwitchToAlerts() throws InterruptedException {
		// Mouse Over
		WebElement menuSwitchToAlerts = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(menuSwitchToAlerts).perform();
		Thread.sleep(1000);
	}

	public void clicarOpcaoAlerts() throws InterruptedException {
		WebElement opcaoAlerts = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
		opcaoAlerts.click();
		Thread.sleep(1000);
	}

	public void clicarOpcaoTextBox() throws InterruptedException {
		WebElement opcaoTextBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		opcaoTextBox.click();
		Thread.sleep(500);
	}

	public void clicarButtonBox() throws InterruptedException {
		WebElement buttonBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
		buttonBox.click();
		Thread.sleep(2000);
		// Colocando nome no PopUp
		driver.switchTo().alert().sendKeys("Carlos");
		Thread.sleep(300);
		driver.switchTo().alert().accept();
		// Comparando o resultado com o esperado!
		String messageHello = driver.findElement(By.id("demo1")).getText();
		Assert.assertEquals(messageHello, "Hello Carlos How are you today");
		Thread.sleep(3000);
	}

	public void clicarOpcaoOkCancel() throws InterruptedException {
		WebElement opcaoOkCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		opcaoOkCancel.click();
		Thread.sleep(500);
	}

	public void clicarOpcaoWithOK() throws InterruptedException {
		WebElement opcaoWithOk = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		opcaoWithOk.click();
		Thread.sleep(3000);
		// Scroll da Tela
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy (0,400)");
		Thread.sleep(3000);
	}

}
