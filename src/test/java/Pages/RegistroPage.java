package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroPage {
	
	static WebDriver driver;
	
public void HomePage (WebDriver driver) {
	   HomePage.driver = driver;
}	
public RegistroPage (WebDriver driver) {
	   RegistroPage.driver = driver;
	}
	
public void editarCampoFirstName () throws InterruptedException {
		
	WebElement CampoFirstName = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	CampoFirstName.sendKeys("Carlos");
	Thread.sleep(2000);
	}

public void editarCampoLastName () throws InterruptedException {
	
	WebElement CampoLastName = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	CampoLastName.sendKeys("Guillen");
	Thread.sleep(1000);
	}

public void editarCampoAddress () throws InterruptedException {
	
	WebElement CampoAddress = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	CampoAddress.sendKeys("Alamenda do Sol 1012, Bairro da Lua, Cidade da Noite, Brasil");
	Thread.sleep(500);
	}

public void editarCampoEmailAddress () throws InterruptedException {
	
	WebElement CampoEmailAddress = driver.findElement (By.xpath("//*[@id=\"eid\"]/input"));
	CampoEmailAddress.sendKeys("carlostester@yahoo.com.br");
	Thread.sleep(500);
	}

public void editarCampoPhone () throws InterruptedException {
	
	WebElement CampoPhone = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	CampoPhone.sendKeys("1981088181");
	Thread.sleep(500);
	}

public void editarCampoGender () throws InterruptedException {
	
	WebElement CampoGender = driver.findElement (By.name("radiooptions"));
	CampoGender.click();
	Thread.sleep(500);
	}

public void editarCampoCountry () throws InterruptedException {
	
	WebElement CampoCountry = driver.findElement (By.id("countries"));
	CampoCountry.click();
	Thread.sleep(500);
	}

public void entrarComPais () throws InterruptedException {
	
	WebElement EntrarPais = driver.findElement (By.xpath("//*[@id=\"countries\"]/option[6]"));
	EntrarPais.click();
	Thread.sleep(500);
	}

public void editarCampoYear () throws InterruptedException {
	
	WebElement CampoYear = driver.findElement (By.xpath("//*[@id=\"yearbox\"]"));
	CampoYear.click();
	Thread.sleep(500);
	}

public void entrarComAno () throws InterruptedException {
	
	WebElement entrarAno = driver.findElement (By.xpath("//*[@id=\"yearbox\"]/option[66]"));
	entrarAno.click();
	Thread.sleep(500);
	}

public void editarCampoMonth () throws InterruptedException {
	
	WebElement CampoMonth = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	CampoMonth.click();
	Thread.sleep(500);
	}

public void entrarComMes () throws InterruptedException {
	
	WebElement entrarMes = driver.findElement (By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[5]"));
	entrarMes.click();
	Thread.sleep(500);
	}

public void editarCampoDay () throws InterruptedException {
	
	WebElement CampoDay = driver.findElement (By.xpath("//*[@id=\"daybox\"]"));
	CampoDay.click();
	Thread.sleep(500);
	}

public void entrarComDia () throws InterruptedException {
	
	WebElement entrarDia = driver.findElement (By.xpath("//*[@id=\"daybox\"]/option[21]"));
	entrarDia.click();
	Thread.sleep(500);
	}

public void editarCampoPassword () throws InterruptedException {
	
	WebElement CampoPassword = driver.findElement (By.id("firstpassword"));
	CampoPassword.sendKeys("Teste1234");
	Thread.sleep(500);
	}

public void editarCampoConfirmPassword () throws InterruptedException {
	
	WebElement CampoConfirmPassword = driver.findElement (By.id("secondpassword"));
	CampoConfirmPassword.sendKeys("Teste1234");
	Thread.sleep(500);
	}

public void clicarBotaoSubmit () throws InterruptedException {
	
	WebElement BotaoSubmit = driver.findElement (By.xpath("//*[@id=\"submitbtn\"]"));
	BotaoSubmit.click();
	Thread.sleep(2000);
	}

}
