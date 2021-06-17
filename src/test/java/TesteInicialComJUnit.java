import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageseobj.DriverObj;

public class TesteInicialComJUnit {

	Select select;

	@Test
	public void metodoGeral() {

		WebDriver driver = new DriverObj().setup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://sampleapp.tricentis.com/101/app.php");

		//PRIMEIRA PAGE
		WebElement comboMake = driver.findElement(By.id("make"));
		select = new Select(comboMake);
		select.selectByVisibleText("Suzuki");

		WebElement comboModel = driver.findElement(By.id("model"));
		select = new Select(comboModel);
		select.selectByVisibleText("Three-Wheeler");

		driver.findElement(By.id("dateofmanufacture")).sendKeys("06/10/2021");
		driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
		driver.findElement(By.id("engineperformance")).sendKeys("2000");

		WebElement comboSeats = driver.findElement(By.id("numberofseats"));
		select = new Select(comboSeats);
		select.selectByVisibleText("4");

		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span"))
				.click();

		WebElement comboSeatsMoto = driver.findElement(By.id("numberofseatsmotorcycle"));
		select = new Select(comboSeatsMoto);
		select.selectByVisibleText("2");

		WebElement comboFuel = driver.findElement(By.id("fuel"));
		select = new Select(comboFuel);
		select.selectByVisibleText("Gas");

		driver.findElement(By.id("payload")).sendKeys("50");
		driver.findElement(By.id("totalweight")).sendKeys("500");
		driver.findElement(By.id("listprice")).sendKeys("1000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("10");
		driver.findElement(By.id("annualmileage")).sendKeys("100");
		driver.findElement(By.id("nextenterinsurantdata")).click();

		// SEGUNDDA PAGE
		driver.findElement(By.id("firstname")).sendKeys("joao");
		driver.findElement(By.id("lastname")).sendKeys("silva");
		driver.findElement(By.id("birthdate")).sendKeys("06/10/2000");
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span"))
				.click();
		driver.findElement(By.id("streetaddress")).sendKeys("street example");

		WebElement comboPais = driver.findElement(By.id("country"));
		select = new Select(comboPais);
		select.selectByVisibleText("Brazil");

		driver.findElement(By.id("zipcode")).sendKeys("245987");
		driver.findElement(By.id("city")).sendKeys("Rio de Janeiro");

		WebElement comboOccupation = driver.findElement(By.id("occupation"));
		select = new Select(comboOccupation);
		select.selectByVisibleText("Farmer");

		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3) > span"))
				.click();
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox.valid > p > label:nth-child(2) > span"))
				.click();
		driver.findElement(By.id("website")).sendKeys("www.site.com");
		driver.findElement(By.id("picture")).sendKeys("imagem.jpg");
		driver.findElement(By.id("nextenterproductdata")).click();

		// TERCEIRA PAGE
		driver.findElement(By.id("startdate")).sendKeys("01/10/2023");

		WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
		select = new Select(comboInsurance);
		select.selectByVisibleText("7.000.000,00");

		WebElement comboMerit = driver.findElement(By.id("meritrating"));
		select = new Select(comboMerit);
		select.selectByVisibleText("Bonus 5");

		WebElement comboDamage = driver.findElement(By.id("damageinsurance"));
		select = new Select(comboDamage);
		select.selectByVisibleText("No Coverage");

		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span"))
				.click();

		WebElement comboCourte = driver.findElement(By.id("courtesycar"));
		select = new Select(comboCourte);
		select.selectByVisibleText("No");

		driver.findElement(By.id("nextselectpriceoption")).click();

		// QUARTA PAGINA
		driver.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")).click();
		driver.findElement(By.id("nextsendquote")).click();

		// QUINTA PAGINA
		driver.findElement(By.id("email")).sendKeys("joao@mail.com");
		driver.findElement(By.id("phone")).sendKeys("99999999");
		driver.findElement(By.id("username")).sendKeys("joao");
		driver.findElement(By.id("password")).sendKeys("1234aB");
		driver.findElement(By.id("confirmpassword")).sendKeys("1234aB");
		driver.findElement(By.id("Comments")).sendKeys("concluido");
		driver.findElement(By.id("sendemail")).click();

		// validacao
		String mensagemValido = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"))
				.getText();
		Assert.assertEquals("Sending e-mail success!", mensagemValido);
		
		//fechar
		driver.quit();
	}
}
