package pageseobj;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PricePage {
	
	public static Select select;
	public static WebDriver driver;

	@Test
	public WebElement priceTable() {
		return driver.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span"));
	}
	
	public WebElement nextSend() {
		return driver.findElement(By.id("nextsendquote"));
	}

}
