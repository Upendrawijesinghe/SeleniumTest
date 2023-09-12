package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Demose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

		driver.findElement(By.xpath("//*[@id=\"topNavbar\"]/div/div/div[1]/div[2]/a")).click();
		
		Thread.sleep(10000l);
		
		String Fname = driver.findElement(By.xpath("//*[@id=\"LblFirstName\"]")).getText();
		
		System.out.println (Fname);
		
        String Lname = driver.findElement(By.xpath("//*[@id=\"LblLastName\"]")).getText();
		
		System.out.println (Lname);
		
	}
}