package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WidgetsAccordionPage {

	static WebDriver driver;

	public WidgetsAccordionPage(WebDriver driver) {
		WidgetsAccordionPage.driver = driver;
	}

	public void acessarMenuWidgetsAccordion () throws InterruptedException {
		// Mouse Over
		WebElement menuWidgetsAccordion = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(menuWidgetsAccordion).perform();
	}

	public void clicarOpcaoAccordion () throws InterruptedException {
		WebElement opcaoAccordion= driver
				.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[1]/a"));
		opcaoAccordion.click();
	}
	
	public void clicarCollapsible2 () throws InterruptedException {
		WebElement Collapsible2 = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[2]/div[1]/h4/a/b"));
		Collapsible2.click();
	}
	
	public void clicarCollapsible3 () throws InterruptedException {
		WebElement Collapsible3 = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[3]/div[1]/h4/a/b"));
		Collapsible3.click();
	}
	
	public void clicarCollapsible4 () throws InterruptedException {
		WebElement Collapsible4 = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[4]/div[1]/h4/a/b"));
		Collapsible4.click();
	}
	
	public void clicarCollapsible1 () throws InterruptedException {
		WebElement Collapsible1 = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[1]/div[1]/h4/a/b"));
		Collapsible1.click();
	}
	
	public void clicarCollapsible2a () throws InterruptedException {
		WebElement Collapsible2a = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[2]/div[1]/h4/a/b"));
		Collapsible2a.click();
	}
	
	public void clicarCollapsible3a () throws InterruptedException {
		WebElement Collapsible3a = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[3]/div[1]/h4/a/b"));
		Collapsible3a.click();
	}
	
	public void clicarCollapsible4a () throws InterruptedException {
		WebElement Collapsible4a = driver
				.findElement(By.xpath("//*[@id=\"Functionality\"]/div/div/div/div[4]/div[1]/h4/a/b"));
		Collapsible4a.click();
	}
	
	
}
