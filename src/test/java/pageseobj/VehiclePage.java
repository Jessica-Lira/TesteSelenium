package pageseobj;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehiclePage {
	
	public static Select select;
	public static WebDriver driver;

	@Test

	public static WebElement comboMake() {
		WebElement comboMake = driver.findElement(By.id("make"));
		select = new Select(comboMake);
		select.selectByVisibleText("Suzuki");
		return comboMake;
    }
	
	public static WebElement comboModel() {
		WebElement comboModel = driver.findElement(By.id("model"));
		select = new Select(comboModel);
		select.selectByVisibleText("Three-Wheeler");
		return comboModel;
    }
	
	public WebElement campoDataManufacture() {
		return driver.findElement(By.id("dateofmanufacture"));
	}
	
	public WebElement campoCylinder() {
		return driver.findElement(By.id("cylindercapacity"));
	}
	
	public static WebElement campoEngine() {
		return driver.findElement(By.id("engineperformance"));
	}

	public static WebElement comboSeats() {
		WebElement comboSeats = driver.findElement(By.id("numberofseats"));
		select = new Select(comboSeats);
		select.selectByVisibleText("4");
		return comboSeats;
    }
	
	public static WebElement selectHandDrive() {
		return driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span"));	
	}
	
	public static WebElement comboSeatsMotorcycle() {
		WebElement comboSeatsMoto = driver.findElement(By.id("numberofseatsmotorcycle"));
		select = new Select(comboSeatsMoto);
		select.selectByVisibleText("2");
		return comboSeatsMoto;
	}
	
	public static WebElement comboFuel() {
		WebElement comboFuel = driver.findElement(By.id("fuel"));
		select = new Select(comboFuel);
		select.selectByVisibleText("Gas");
		return comboFuel;
	}
	
	public static WebElement campoPayload() {
		return driver.findElement(By.id("payload"));
	}
	
	public static WebElement campoWeight() {
		return driver.findElement(By.id("totalweight"));
	}
	
	public static WebElement campoPrice() {
		return driver.findElement(By.id("listprice"));
	}
	
	public static WebElement campoLicence() {
		return driver.findElement(By.id("licenseplatenumber"));
	}
	
	public static WebElement campoMileage() {
		return driver.findElement(By.id("annualmileage"));
	}
	
	public static WebElement campoNextInsurant() {
		return driver.findElement(By.id("nextenterinsurantdata"));
	}
}

