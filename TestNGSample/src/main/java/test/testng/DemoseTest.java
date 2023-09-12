package test.testng;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoseTest {

ChromeDriver driver;
	
	@Test(priority=1)
	public void BaseURLTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get ("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		System.out.println("1");
	}
	
	@Test(priority=2)
	public void CookiePopupTest() throws InterruptedException {
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		Thread.sleep(10000l);
		System.out.println("2");
	}
	
	@Test(priority=3)
	public void ProductButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a")).click();
				
		Thread.sleep(10000l);
		System.out.println("3");
	}
	
	
	@Test(priority=4)
	public void ProductButtonHoverOverTest() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		Thread.sleep(10000l);

		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[1]/div[2]/a")).click();
		
		Thread.sleep(10000l);
		
		System.out.println("4");
	}
	
	@Test(priority=5)
	public void FirstNameLabelTest() throws InterruptedException {
		
		String Fname = driver.findElement(By.xpath("//*[@id=\"LblFirstName\"]")).getText();
		System.out.println (Fname);	
		System.out.println("5");
		
		assertEquals(Fname, "*First Name","First Name Label missmatch");
	}
	
	@Test(priority=6)
	public void LastNameLabelTest() throws InterruptedException {		
		String Lname = driver.findElement(By.xpath("//*[@id=\"LblLastName\"]")).getText();
		System.out.println (Lname);
		
		System.out.println("6");
	}

}