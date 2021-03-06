package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	}

	public void clicarOpcaoModals() throws InterruptedException {
		WebElement opcaoModals = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[7]/a"));
		opcaoModals.click();
	}

	public void clicarBotaoModal() {
		WebElement botaoModal = driver.findElement(By.xpath("/html/body/section/div[1]/div[1]/div/div[2]/a"));
		botaoModal.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]")));

		WebElement botaoSave = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]"));
		botaoSave.click();
	}

	public void acessarMenuSwitchToAlerts() throws InterruptedException {
		// Mouse Over
		WebElement menuSwitchToAlerts = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(menuSwitchToAlerts).perform();
	}

	public void clicarOpcaoAlerts() throws InterruptedException {
		WebElement opcaoAlerts = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
		opcaoAlerts.click();
	}

	public void clicarOpcaoTextBox() throws InterruptedException {
		WebElement opcaoTextBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		opcaoTextBox.click();
	}

	public void clicarButtonBox() throws InterruptedException {
		WebElement buttonBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button"));
		buttonBox.click();

		// Colocando nome no PopUp
		driver.switchTo().alert().sendKeys("Carlos");
		driver.switchTo().alert().accept();

		// Comparando o resultado com o esperado!
		String messageHello = driver.findElement(By.id("demo1")).getText();
		Assert.assertEquals(messageHello, "Hello Carlos How are you today");
	}

	public void clicarOpcaoOkCancel() throws InterruptedException {
		WebElement opcaoOkCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		opcaoOkCancel.click();
	}

	public void clicarOpcaoWithOK() throws InterruptedException {
		WebElement opcaoWithOk = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		opcaoWithOk.click();

		// Scroll da Tela
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy (0,400)");
	}

}
