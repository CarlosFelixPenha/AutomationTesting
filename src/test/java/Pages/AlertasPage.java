package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertasPage {

	static WebDriver driver;
	
//	public void HomePage (WebDriver driver) {
//		   HomePage.driver = driver;
//	}	
//	public void RegistroPage (WebDriver driver) {
//		   RegistroPage.driver = driver;
//		}
	public AlertasPage (WebDriver driver) {
		   AlertasPage.driver = driver;
		}
		
	public void acessarMenuWebTable () throws InterruptedException {
		
		WebElement MenuWebTable = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		MenuWebTable.click();;
		Thread.sleep(2000);
		}
	
}
