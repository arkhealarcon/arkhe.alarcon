import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JupiterShopPage extends BaseClass {
	
	static WebElement element = null;
	
	public static WebElement shopTab() {
		element = driver.findElement(By.xpath("//li[@id='nav-shop']/descendant::a[text()='Shop']"));
		return element;
	}
	
	public static WebElement itemFunnyCow() {
		element = driver.findElement(By.xpath("//*[text()='Funny Cow']//..//following-sibling::p/child::a"));
		return element;
	}
	
	public static WebElement itemFluffyBunny() {
		element = driver.findElement(By.xpath("//*[text()='Fluffy Bunny']//..//following-sibling::p/child::a"));
		return element;
	}
	
	public static WebElement itemFluffyBunnyPrice() {
		element = driver.findElement(By.xpath("//*[text()='Fluffy Bunny']//..//following-sibling::p/child::span"));
		return element;
	}
	
	public static WebElement myCart() {
		element = driver.findElement(By.xpath("//*[text()='Cart (']"));
		return element;
	}
	
	public static WebElement cartFunnyCow() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/cow.jpg']"));
		return element;
	}
	
	public static WebElement cartFunnyCowQuantity() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/cow.jpg']//../following-sibling::td//child::input"));
		return element;
	}
	
	public static WebElement cartFluffyBunny() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/bunny.jpg']"));
		return element;
	}
	
	public static WebElement cartFluffyBunnyQuantity() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/bunny.jpg']//../following-sibling::td//child::input"));
		return element;
	}

	public static WebElement checkOutButton() {
		element = driver.findElement(By.xpath("//a[@class='btn-checkout btn btn-success  ng-scope']"));
		return element;
	}
	
	
	public static WebElement itemStuffedFrog() {
		element = driver.findElement(By.xpath("//*[text()='Stuffed Frog']//..//following-sibling::p/child::a"));
		return element;
	}
	
	
	public static WebElement itemStuffedFrogPrice() {
		element = driver.findElement(By.xpath("//*[text()='Stuffed Frog']//..//following-sibling::p/child::span"));
		return element;
	}
	
	public static WebElement itemValentineBear() {
		element = driver.findElement(By.xpath("//*[text()='Valentine Bear']//..//following-sibling::p/child::a"));
		return element;
	}
	
	public static WebElement itemValentineBearPrice() {
		element = driver.findElement(By.xpath("//*[text()='Valentine Bear']//..//following-sibling::p/child::span"));
		return element;
	}
	
	
	public static WebElement cartStuffedFrogPrice() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/frog.jpg']//../following-sibling::td[1]"));
		return element;
	}
	
	public static WebElement cartFunnyBunnyPrice() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/bunny.jpg']//../following-sibling::td[1]"));
		return element;
	}
	
	public static WebElement cartValentineBearPrice() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/valentine.jpg']//../following-sibling::td[1]"));
		return element;
	}
	
	public static WebElement cartStuffedFrogTotal() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/frog.jpg']//../following-sibling::td[3]"));
		return element;
	}
	
	public static WebElement cartFunnyBunnyTotal() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/bunny.jpg']//../following-sibling::td[3]"));
		return element;
	}
	
	public static WebElement cartValentineBearTotal() {
		element = driver.findElement(By.xpath("//img[@ng-src='images/src-embed/valentine.jpg']//../following-sibling::td[3]"));
		return element;
	}
	
	public static WebElement cartTotal() {
		element = driver.findElement(By.xpath("//strong[@class='total ng-binding']"));
		return element;
	}
	
}
