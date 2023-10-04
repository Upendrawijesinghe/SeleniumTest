package TestScenarios;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Objects.Cart;
import Objects.Product;
import Objects.Search;

public class FlipKartTestSuite {

	Search search;
	Product product;	
	Cart cart;
	
	ChromeDriver driver = new ChromeDriver();

	@BeforeSuite
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver.get ("https://www.flipkart.com/");
		driver.manage().window().maximize();
		search = new Search(driver);
	}

	@Test(priority=1)
	public void LoginPopupCloseTest() throws InterruptedException {
		Thread.sleep(5000l);
		search.closeLoginPopup();		
	}

	@Test(priority=2)
	public void ProductSearch() throws InterruptedException {
		Thread.sleep(5000l);
		search.searchProduct("Macbook air m2");
	}

	@Test(priority=3)
	public void FirstNameLabelTest() throws InterruptedException {
		Thread.sleep(5000l);
		search.openFirstSearchResult();		
		System.out.println("5");
	}

	@Test(priority=4)
	public void swithToProductTab() throws InterruptedException {
		Thread.sleep(5000l);

		String originalWindow = driver.getWindowHandle();

		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
			if(!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		product = new Product(driver);
		cart = new Cart(driver);

	}

	
	@Test(priority=5)
	public void AddToCartTest() throws InterruptedException {
		Thread.sleep(5000l);
		product.addToCart();		
	}
	
	@Test(priority=6)
	public void CartButtonTest() throws InterruptedException {
		Thread.sleep(10000l);
		cart.openShoppingCart();		
	}

	@Test(priority=7)
	public void CartAddedTest() throws InterruptedException {
		Thread.sleep(5000l);
		assertEquals(cart.getCartName(), "Flipkart (1)","Item failed to be added to cart");
	}
}