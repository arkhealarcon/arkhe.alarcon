import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TestCase1 extends BaseClass {
	
	static String firstName = "First";
	static String email = "test@gmail.com";
	static String message = "test message";
	
	@Test
	public static void contactUs()  {
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JupiterContactPage.contactUsTab().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Submit")));
		JupiterContactPage.submitButton().click();
		
		/*Error message assertion */
		assertTrue(JupiterContactPage.pageErrorMessage().isDisplayed());
		assertTrue(JupiterContactPage.firstNameError().isDisplayed());
		assertTrue(JupiterContactPage.emailError().isDisplayed());
		assertTrue(JupiterContactPage.messageError().isDisplayed());
		
		/*Enter required fields */
		JupiterContactPage.firstNameTextbox().sendKeys(firstName);
		JupiterContactPage.emailTextbox().sendKeys(email);
		JupiterContactPage.messageTextbox().sendKeys(message);
		
		JupiterContactPage.submitButton().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("« Back")));
		assertTrue(JupiterContactPage.contactSuccessMessage().isDisplayed());
		
		driver.close();
		
	}

}
