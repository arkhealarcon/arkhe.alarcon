import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase2 extends BaseClass {
	
	static String firstName = "First";
	static String email = "test@gmail.com";
	static String message = "test message";
	
	@Test
	public static void contactUsMultiple() {
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JupiterContactPage.contactUsTab().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Submit")));
		
		boolean contactSuccess = true;
		
		for (int i = 0; i < 5; i++) {
			JupiterContactPage.firstNameTextbox().sendKeys(firstName);
			JupiterContactPage.emailTextbox().sendKeys(email);
			JupiterContactPage.messageTextbox().sendKeys(message);
			
			JupiterContactPage.submitButton().click();
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("« Back")));
			
			
			if(JupiterContactPage.contactSuccessMessage().isDisplayed()){
				contactSuccess = true;
				
				} else {
				contactSuccess = false;
				break;
				}
			
			System.out.println("Contact Successfully" + " " + i);
			JupiterContactPage.backButton().click();
			
		}
		
		driver.close();
	}

}
