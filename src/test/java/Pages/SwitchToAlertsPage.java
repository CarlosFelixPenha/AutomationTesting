package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToAlertsPage {

	static WebDriver driver;
	
public void HomePage (WebDriver driver) {
		   HomePage.driver = driver;
	}	
	
public SwitchToAlertsPage (WebDriver driver) {
		   SwitchToAlertsPage.driver = driver;
		}
		
public void acessarMenuSwitchTo () throws InterruptedException {
		
		WebElement MenuSwitchTo = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		MenuSwitchTo.click();;
		Thread.sleep(2000);
		}
	
}
