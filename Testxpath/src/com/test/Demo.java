package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver.setup();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get ("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		Thread.sleep(10000l);
		
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a")).click();
				
		Thread.sleep(10000l);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		Thread.sleep(10000l);
		
		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[2]/ul/li[1]/div/div/div/div/div[3]/ul/li[1]/ul/li/a")).click();
						
		driver.close();
//
	}

}
