package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product {
	
	ChromeDriver driver;
	
	By addToCartButton = By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	
	public Product(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void addToCart() {
		driver.findElement(addToCartButton).click();
	}
}
