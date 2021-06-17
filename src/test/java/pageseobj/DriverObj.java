package pageseobj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverObj {
	
	public WebDriver driver;

    public WebDriver setup() {
    	
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        return driver;
    }
}
