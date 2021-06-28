import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase3 extends BaseClass {
    static int funnyCowQuantity = 2;
    static int fluffyBunnyQuantity = 1;
    
	@Test
	public static void buyFunnyCowAndFluffyBunny() {
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JupiterShopPage.shopTab().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Funny Cow']//..//following-sibling::p/child::a")));
		JupiterShopPage.itemFunnyCow().click();
		JupiterShopPage.itemFunnyCow().click();
		JupiterShopPage.itemFluffyBunny().click();
		
		JupiterShopPage.myCart().click();
		
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn-checkout btn btn-success  ng-scope']")));
		 
		 /*Assert funny cow and fluffy bunny is in cart */
		 assertTrue(JupiterShopPage.cartFunnyCow().isDisplayed());
		 assertTrue(JupiterShopPage.cartFluffyBunny().isDisplayed());
		 
		 
		 String a = JupiterShopPage.cartFunnyCowQuantity().getAttribute("value");
		 String b = JupiterShopPage.cartFluffyBunnyQuantity().getAttribute("value");
		 
		 int i=Integer.parseInt(a);  
		 int x=Integer.parseInt(b);
		 
		 /*Assert funny cow and fluffy bunny quantity */
		 assertEquals(funnyCowQuantity, i);
		 assertEquals(fluffyBunnyQuantity, x);
		 
		 driver.close();
	}
}
