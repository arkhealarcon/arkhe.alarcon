import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	String baseurl = "https://jupiter.cloud.planittesting.com/#/";
	
	@Test
	public void openBrowser() throws InterruptedException {		
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arkhe Alarcon\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);

	}
}
