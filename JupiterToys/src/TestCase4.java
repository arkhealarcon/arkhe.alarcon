import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase4 extends BaseClass {
   
    
	@Test
	public static void buyFrogBunnyAndBear() {
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JupiterShopPage.shopTab().click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Funny Cow']//..//following-sibling::p/child::a")));
		
		 String shopFrogPrice = JupiterShopPage.itemStuffedFrogPrice().getText().replace("$", "");
		 String shopBunnyPrice = JupiterShopPage.itemFluffyBunnyPrice().getText().replace("$", "");;
		 String shopBearPrice = JupiterShopPage.itemValentineBearPrice().getText().replace("$", "");;
		 		 
		 Float frogPrice = Float.parseFloat(shopFrogPrice);  
		 Float bunnyPrice = Float.parseFloat(shopBunnyPrice);  
		 Float bearPrice = Float.parseFloat(shopBearPrice);  
		 
		
		 
		 for(int i = 0 ; i<5 ; i++) {
			 if(i<2) {
				 JupiterShopPage.itemStuffedFrog().click(); 
			 }
			 if(i<5) {
				 JupiterShopPage.itemFluffyBunny().click();
			 } 
			 if(i<3) {
				 JupiterShopPage.itemValentineBear().click(); 
			 } 
		 }
		 
		 JupiterShopPage.myCart().click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn-checkout btn btn-success  ng-scope']")));
		 
		 String frogCartPrice = JupiterShopPage.cartStuffedFrogPrice().getText().replace("$", "");;
		 String bunnyCartPrice = JupiterShopPage.cartFunnyBunnyPrice().getText().replace("$", "");;
		 String bearCartPrice = JupiterShopPage.cartValentineBearPrice().getText().replace("$", "");;
		 
		 /*Assert shop price is matching cart price */
		 assertEquals(shopFrogPrice, frogCartPrice);
		 assertEquals(shopBunnyPrice, bunnyCartPrice);
		 assertEquals(shopBearPrice, bearCartPrice);
		 
		 
		 /*Get total */
		 String frogCartTotal = JupiterShopPage.cartStuffedFrogTotal().getText().replace("$", "");;
		 String bunnyCartTotal = JupiterShopPage.cartFunnyBunnyTotal().getText().replace("$", "");;
		 String bearCartTotal = JupiterShopPage.cartValentineBearTotal().getText().replace("$", "");;
		 
		 Float frogCartTotalPrice = Float.parseFloat(frogCartTotal);  
		 Float bunnyCartTotalPrice = Float.parseFloat(bunnyCartTotal); 
		 double roundedbunnyCartTotalPrice = Math.round(bunnyCartTotalPrice);
		 Float bearCartTotalPrice = Float.parseFloat(bearCartTotal);  
		 
		 Float frogTotalCompuation = frogPrice * 2 ;
		 Float bunnyTotalCompuation = bunnyPrice * 5 ;
		 double roundedBunnyTotalCompuation = Math.round(bunnyTotalCompuation);
		 Float bearTotalCompuation = bearPrice * 3 ;
		 
		 /* Assert Per Item Total is Matching Item Price Multiply to Quantity */
		 assertEquals(frogCartTotalPrice, frogTotalCompuation);
		 assertEquals(roundedbunnyCartTotalPrice, roundedBunnyTotalCompuation);
		 assertEquals(bearCartTotalPrice, bearTotalCompuation);
		 
		 /* Assert Cart Total against Subtotal of all items */
		 String cartTotal = JupiterShopPage.cartTotal().getText().replace("Total: ", "");
		 Float CartTotalPrice = Float.parseFloat(cartTotal);
		 Float shopItemTotal = frogCartTotalPrice + bunnyCartTotalPrice + bearCartTotalPrice ;
		 
		 assertEquals(CartTotalPrice, shopItemTotal);
		 
		 driver.quit();
	}
} 