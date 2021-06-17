package pageseobj;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	public static Select select;
	public static WebDriver driver;

	@Test

	public static WebElement dataInicio() {
		return driver.findElement(By.id("startdate"));
	}
	
	public static WebElement comboInsurance() {
		WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
		select = new Select(comboInsurance);
		select.selectByVisibleText("7.000.000,00");
		return comboInsurance;
	}
	
	public static WebElement comboMerit() {
		WebElement comboMerit = driver.findElement(By.id("meritrating"));
		select = new Select(comboMerit);
		select.selectByVisibleText("Bonus 5");
		return comboMerit;
	}
	
	public static WebElement comboDamage() {
		WebElement comboDamage = driver.findElement(By.id("damageinsurance"));
		select = new Select(comboDamage);
		select.selectByVisibleText("No Coverage");
		return comboDamage;
	}
	
	public static WebElement optionalProduct() {
		return driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span"));
	}
	
	public static WebElement comboCourt() {
		WebElement comboCourte = driver.findElement(By.id("courtesycar"));
		select = new Select(comboCourte);
		select.selectByVisibleText("No");
		return comboCourte;
	}

	public static WebElement btnNextPrice() {
		return driver.findElement(By.id("nextselectpriceoption"));
	}
}
