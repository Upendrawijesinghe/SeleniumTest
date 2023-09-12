import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {

	ChromeDriver driver;

	@Test(priority=1)
	public void BaseUrl() throws InterruptedException {
		//WebDriverManager.chromedriver.setup();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get ("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		System.out.println (1);
	}
	
	@Test(priority=2)
	
	public void CookiePopupTest() throws InterruptedException {

		Thread.sleep(5000l);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(10000l);
		System.out.println (2);
	}
	@Test(priority=3)
	
	public void ProductButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a")).click();
        Thread.sleep(10000l);
        System.out.println(3);
		
	}
	@Test(priority=4)
	public void ProcessDivery() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
        Thread.sleep(10000l);
        System.out.println (4);
        }
	@Test(priority=5)
	public void NavigatetoURL() throws InterruptedException {
	
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/div/div/div/div/div[3]/ul/li[1]/ul/li/a")).click();
		System.out.println (5);
	}
	
	@Test(priority=6)
	
	public void BrowserCloseL() throws InterruptedException {
	     driver.close();
	     System.out.println (6);
	}

}



