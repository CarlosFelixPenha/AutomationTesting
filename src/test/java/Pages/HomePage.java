package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	static WebDriver driver;

	public HomePage (WebDriver driver) {
		HomePage.driver = driver;
		
	}

	public void clicarMenuDemoSite () throws InterruptedException {
				
		WebElement menuDemoSite = driver.findElement (By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/nav/ul/li[7]/a"));
		menuDemoSite.click();
		Thread.sleep(2000);
	
	}

}
