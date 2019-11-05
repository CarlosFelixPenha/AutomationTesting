package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistroPage {

	static WebDriver driver;

	public RegistroPage(WebDriver driver) {
		RegistroPage.driver = driver;
	}

	public void editarCampoFirstName() throws InterruptedException {
		WebElement campoFirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		campoFirstName.sendKeys("Carlos");
		Thread.sleep(500);
	}

	public void editarCampoLastName() throws InterruptedException {
		WebElement campoLastName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		campoLastName.sendKeys("Guillen");
		Thread.sleep(500);
	}

	public void editarCampoAddress() throws InterruptedException {
		WebElement campoAddress = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		campoAddress.sendKeys("Alamenda do Sol 1012, Bairro da Lua, Cidade da Noite, Brasil");
		Thread.sleep(500);
	}

	public void editarCampoEmailAddress() throws InterruptedException {
		WebElement campoEmailAddress = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		campoEmailAddress.sendKeys("carlostester@yahoo.com.br");
		Thread.sleep(500);
	}

	public void editarCampoPhone() throws InterruptedException {
		WebElement campoPhone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		campoPhone.sendKeys("1981088181");
		Thread.sleep(500);
	}

	public void editarCampoGender() throws InterruptedException {
		WebElement campoGender = driver.findElement(By.name("radiooptions"));
		campoGender.click();
		Thread.sleep(500);
	}

	public void entrarComPais() throws InterruptedException {
		WebElement campoCountry = driver.findElement(By.id("countries"));
		campoCountry.click();
		WebElement EntrarPais = driver.findElement(By.xpath("//*[@id=\"countries\"]/option[6]"));
		EntrarPais.click();
		Thread.sleep(500);
	}

	public void entrarComAno() throws InterruptedException {
		WebElement campoYear = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		campoYear.click();
		WebElement entrarAno = driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[66]"));
		entrarAno.click();
		Thread.sleep(500);
	}

	public void entrarComMes() throws InterruptedException {
		WebElement campoMonth = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		campoMonth.click();
		WebElement entrarMes = driver
				.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[5]"));
		entrarMes.click();
		Thread.sleep(500);
	}

	public void entrarComDia() throws InterruptedException {
		WebElement campoDay = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		campoDay.click();
		WebElement entrarDia = driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[21]"));
		entrarDia.click();
		Thread.sleep(500);
	}

	public void editarCampoPassword() throws InterruptedException {
		WebElement campoPassword = driver.findElement(By.id("firstpassword"));
		campoPassword.sendKeys("Teste1234");
		Thread.sleep(500);
	}

	public void editarCampoConfirmPassword() throws InterruptedException {
		WebElement campoConfirmPassword = driver.findElement(By.id("secondpassword"));
		campoConfirmPassword.sendKeys("Teste1234");
		Thread.sleep(500);
	}

	public void clicarBotaoSubmit() throws InterruptedException {
		WebElement botaoSubmit = driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		botaoSubmit.click();
		Thread.sleep(2000);
	}

}
