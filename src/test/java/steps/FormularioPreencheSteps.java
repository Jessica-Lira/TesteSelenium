package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageseobj.DriverObj;

public class FormularioPreencheSteps {

	WebDriver driver;
	Select select;

	@Before
	public void preCondicao() {
		driver = new DriverObj().setup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// ------------- PRIMEIRO FORM ------------------

	@Dado("que o usuario esta no site da tricentis")
	public void que_o_usuario_esta_no_site_da_tricentis() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}

	@E("esta na aba enter vehicle data")
	public void esta_na_aba_enter_vehicle_data() {
		driver.findElement(By.id("entervehicledata")).click();
	}

	@E("seleciona a make")
	public void seleciona_a_make() {
		WebElement comboMake = driver.findElement(By.id("make"));
		select = new Select(comboMake);
		select.selectByVisibleText("Suzuki");
	}

	@E("seleciona o model")
	public void seleciona_o_model() {
		WebElement comboModel = driver.findElement(By.id("model"));
		select = new Select(comboModel);
		select.selectByVisibleText("Three-Wheeler");
	}

	@E("digita a cylinder capacity")
	public void digita_a_cylinder_capacity() {
		driver.findElement(By.id("cylindercapacity")).sendKeys("1000");
	}

	@E("digita o engine performance")
	public void digita_o_engine_performance() {
		driver.findElement(By.id("engineperformance")).sendKeys("2000");
	}

	@E("insire a date of manufacture")
	public void insire_a_date_of_manufacture() {
		driver.findElement(By.id("dateofmanufacture")).sendKeys("06/10/2021");
	}

	@E("seleciona o number of seats")
	public void seleciona_o_number_of_seats() {
		WebElement comboSeats = driver.findElement(By.id("numberofseats"));
		select = new Select(comboSeats);
		select.selectByVisibleText("4");
	}

	@E("seleciona o right hand drive")
	public void seleciona_o_right_hand_drive() {
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span"))
				.click();
	}

	@E("seleciona novamente number of seats")
	public void seleciona_novamente_number_of_seats() {
		WebElement comboSeatsMoto = driver.findElement(By.id("numberofseatsmotorcycle"));
		select = new Select(comboSeatsMoto);
		select.selectByVisibleText("2");
	}

	@E("seleciona o fuel type")
	public void seleciona_o_fuel_type() {
		WebElement comboFuel = driver.findElement(By.id("fuel"));
		select = new Select(comboFuel);
		select.selectByVisibleText("Gas");
	}

	@E("digita a payload")
	public void digita_a_payload() {
		driver.findElement(By.id("payload")).sendKeys("50");
	}

	@E("digita o total weight")
	public void digita_o_total_weight() {
		driver.findElement(By.id("totalweight")).sendKeys("500");
	}

	@E("digita o list price")
	public void digita_o_list_price() {
		driver.findElement(By.id("listprice")).sendKeys("1000");
	}

	@E("digita o license plate number")
	public void digita_o_license_plate_number() {
		driver.findElement(By.id("licenseplatenumber")).sendKeys("10");
	}

	@E("digita o annual mileage")
	public void digita_o_annual_mileage() {
		driver.findElement(By.id("annualmileage")).sendKeys("100");
	}

	@E("clica em next insurant")
	public void clica_em_next_insurant() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	@Entao("deve ir para a aba seguinte insurant")
	public void deve_ir_para_a_aba_seguinte_insurant() {
		String tituloEsperado = "Enter Insurant Data";
		Assert.assertEquals(tituloEsperado, driver.getTitle());
	}

	// ------------- SEGUNDO FORM ------------------

	@E("esta na aba enter insurant data")
	public void esta_na_aba_enter_insurant_data() {
		driver.findElement(By.id("enterinsurantdata")).click();
	}

	@E("digita o first name")
	public void digita_o_first_name() {
		driver.findElement(By.id("firstname")).sendKeys("joao");
	}

	@E("digita o last name")
	public void digita_o_last_name() {
		driver.findElement(By.id("lastname")).sendKeys("silva");
	}

	@E("insire a date of birth")
	public void insire_a_date_of_birth() {
		driver.findElement(By.id("birthdate")).sendKeys("06/10/2000");
	}

	@E("seleciona o gender")
	public void seleciona_o_gender() {
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span"))
				.click();
	}

	@E("digita o street address")
	public void digita_o_street_address() {
		driver.findElement(By.id("streetaddress")).sendKeys("street example");
	}

	@E("seleciona a country")
	public void seleciona_a_country() {
		WebElement comboPais = driver.findElement(By.id("country"));
		select = new Select(comboPais);
		select.selectByVisibleText("Brazil");
	}

	@E("digita o zip code")
	public void digita_o_zip_code() {
		driver.findElement(By.id("zipcode")).sendKeys("245987");
	}

	@E("digita a city")
	public void digita_a_city() {
		driver.findElement(By.id("city")).sendKeys("Rio de Janeiro");
	}

	@E("seleciona a occupation")
	public void seleciona_a_occupation() {
		WebElement comboOccupation = driver.findElement(By.id("occupation"));
		select = new Select(comboOccupation);
		select.selectByVisibleText("Farmer");
	}

	@E("seleciona os hobbies")
	public void seleciona_os_hobbies() {
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3) > span"))
				.click();
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox.valid > p > label:nth-child(2) > span"))
				.click();
	}

	@E("digita o website")
	public void digita_o_website() {
		driver.findElement(By.id("website")).sendKeys("www.site.com");
	}

	@E("digita o local da picture")
	public void digita_o_local_da_picture() {
		driver.findElement(By.id("picture")).sendKeys("imagem.jpg");
	}

	@E("clica em next product")
	public void clica_em_next_product() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}

	@Entao("deve ir para a aba seguinte product")
	public void deve_ir_para_a_aba_seguinte_product() {
		String tituloEsperado = "Enter Product Data";
		Assert.assertEquals(tituloEsperado, driver.getTitle());
	}

	// ------------- TERCEIRO FORM ------------------

	@E("esta na aba enter product data")
	public void esta_na_aba_enter_product_data() {
		driver.findElement(By.id("enterproductdata")).click();
	}

	@E("seleciona a start date")
	public void seleciona_a_start_date() {
		driver.findElement(By.id("startdate")).sendKeys("01/10/2023");
	}

	@E("seleciona a insurance sum")
	public void seleciona_a_insurance_sum() {
		WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
		select = new Select(comboInsurance);
		select.selectByVisibleText("7.000.000,00");
	}

	@E("seleciona a merit rating")
	public void seleciona_a_merit_rating() {
		WebElement comboMerit = driver.findElement(By.id("meritrating"));
		select = new Select(comboMerit);
		select.selectByVisibleText("Bonus 5");
	}

	@E("seleciona a damage insurance")
	public void seleciona_a_damage_insurance() {
		WebElement comboDamage = driver.findElement(By.id("damageinsurance"));
		select = new Select(comboDamage);
		select.selectByVisibleText("No Coverage");
	}

	@E("seleciona o optional products")
	public void seleciona_o_optional_products() {
		driver.findElement(By.cssSelector(
				"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2) > span"))
				.click();
	}

	@E("seleciona a courtesy car")
	public void seleciona_a_courtesy_car() {
		WebElement comboCourte = driver.findElement(By.id("courtesycar"));
		select = new Select(comboCourte);
		select.selectByVisibleText("No");
	}

	@E("clica em next price")
	public void clica_em_next_price() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}

	@Entao("deve ir para a aba seguinte price")
	public void deve_ir_para_a_aba_seguinte_price() {
		String tituloEsperado = "Select Price Option";
		Assert.assertEquals(tituloEsperado, driver.getTitle());
	}

	// ------------- QUARTO FORM ------------------

	@E("esta na aba select price option")
	public void esta_na_aba_select_price_option() {
		driver.findElement(By.id("selectpriceoption")).click();
	}

	@E("seleciona um item option")
	public void seleciona_um_item_option() {
		driver.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")).click();
	}

	@E("clica em next send")
	public void clica_em_next_send() {
		driver.findElement(By.id("nextsendquote")).click();
	}

	@Entao("deve ir para a aba seguinte send")
	public void deve_ir_para_a_aba_seguinte_send() {
		String tituloEsperado = "Send Quote";
		Assert.assertEquals(tituloEsperado, driver.getTitle());
	}

	// ------------- QUINTO FORM ------------------

	@E("esta na aba send quote")
	public void esta_na_aba_send_quote() {
		driver.findElement(By.id("sendquote")).click();
	}

	@E("preenche o e-mail")
	public void preenche_o_e_mail() {
		driver.findElement(By.id("email")).sendKeys("joao@mail.com");
	}

	@E("digita o phone")
	public void digita_o_phone() {
		driver.findElement(By.id("phone")).sendKeys("99999999");
	}

	@E("digita o username")
	public void digita_o_username() {
		driver.findElement(By.id("username")).sendKeys("joao");
	}

	@E("digita a password")
	public void digita_a_password() {
		driver.findElement(By.id("password")).sendKeys("1234aB");
	}

	@E("digita a confirm password")
	public void digita_a_confirm_password() {
		driver.findElement(By.id("confirmpassword")).sendKeys("1234aB");
	}

	@E("digita em comments")
	public void digita_em_comments() {
		driver.findElement(By.id("Comments")).sendKeys("concluido");
	}

	@E("pressiona Send")
	public void pressiona_send() {
		driver.findElement(By.id("sendemail")).click();
	}

	@Entao("Verifico a mensagem {string}")
	public void verifico_a_mensagem(String string) {
		String mensagemValido = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2"))
				.getText();
		Assert.assertEquals(string, mensagemValido);
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
}
