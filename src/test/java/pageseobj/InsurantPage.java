package pageseobj;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantPage {
	
	public static Select select;
	public static WebDriver driver;

	@Test
	public static WebElement insereNome() {
		return driver.findElement(By.id("firstname"));
	}
	
	public static WebElement insereSobrenome() {
		return driver.findElement(By.id("lastname"));
	}
	
	public static WebElement insereNasc() {
		return driver.findElement(By.id("birthdate"));
	}
	
	public static WebElement insereGender() {
		return driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span"));
	}
	
	public static WebElement insereEndereco() {
		return driver.findElement(By.id("streetaddress"));
	}
	
	public static WebElement comboPais() {
		WebElement comboPais = driver.findElement(By.id("country"));
		select = new Select(comboPais);
		select.selectByVisibleText("Brazil");
		return comboPais;
	}
	
	public static WebElement insereZipcode() {
		return driver.findElement(By.id("zipcode"));
	}
	
	public static WebElement insereCity() {
		return driver.findElement(By.id("city"));
	}
	
	public static WebElement comboOcupacao() {
		WebElement comboOccupation = driver.findElement(By.id("occupation"));
		select = new Select(comboOccupation);
		select.selectByVisibleText("Farmer");
		return comboOccupation;
	}
	
	public static WebElement insereHobby1() {
		return driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3) > span"));
	}
	public static WebElement insereHobby2() {
	return driver.findElement(By.cssSelector(
			"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox.valid > p > label:nth-child(2) > span"));
	}
	
	public static WebElement insereSite() {
		return driver.findElement(By.id("website"));
	}
	
	public static WebElement insereFigura() {
		return driver.findElement(By.id("picture"));
	}
	
	public static WebElement btnNextProduct() {
		return driver.findElement(By.id("nextenterproductdata"));
	}
}
