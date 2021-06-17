package pageseobj;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SendPage {
	
	public static Select select;
	public static WebDriver driver;

	@Test	
	public static WebElement campoEmail() {
		return driver.findElement(By.id("email"));
	}
	public static WebElement campoPhone() {
		return driver.findElement(By.id("phone"));
	}
	public static WebElement campoUsername() {
		return driver.findElement(By.id("username"));
	}
	public static WebElement campoPassword() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement campoConfirmPassword() {
		return driver.findElement(By.id("confirmpassword"));
	}
	public static WebElement addComments() {
		return driver.findElement(By.id("Comments"));
	}
	public static WebElement btnSend() {
		return driver.findElement(By.id("sendemail"));
	}
	public static WebElement visualizaMsg() {
		String mensagemValido = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"))
				.getText();
		Assert.assertEquals("Sending e-mail success!", mensagemValido);
		return null;
	}
}
