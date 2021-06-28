import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JupiterContactPage extends BaseClass {
	
	static WebElement element = null;
	
	public static WebElement contactUsTab() {
		element = driver.findElement(By.xpath("//li[@id='nav-contact']/descendant::a[text()='Contact']"));
		return element;
	}
	
	public static WebElement submitButton() {
		element = driver.findElement(By.xpath("//*[text()='Submit']"));
		return element;
	}
	
	public static WebElement pageErrorMessage() {
		element = driver.findElement(By.xpath("//div[@class='alert alert-error ng-scope']"));
		return element;
	}
	
	public static WebElement firstNameError() {
		element = driver.findElement(By.xpath("//span[text()='Forename is required']"));
		return element;
	}
	
	public static WebElement emailError() {
		element = driver.findElement(By.xpath("//span[text()='Email is required']"));
		return element;
	}
	
	public static WebElement messageError() {
		element = driver.findElement(By.xpath("//span[text()='Message is required']"));
		return element;
	}
	
	public static WebElement firstNameTextbox() {
		element = driver.findElement(By.xpath("//input[@name='forename']"));
		return element;
	}
	
	public static WebElement emailTextbox() {
		element = driver.findElement(By.xpath("//input[@name='email']"));
		return element;
	}
	
	public static WebElement messageTextbox() {
		element = driver.findElement(By.xpath("//textarea[@name='message']"));
		return element;
	}
	
	public static WebElement contactSuccessMessage() {
		element = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		return element;
	}
	
	public static WebElement backButton() {
		element = driver.findElement(By.xpath("//*[text()='« Back']"));
		return element;
	}
	
}
