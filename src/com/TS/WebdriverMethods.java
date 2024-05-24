package com.TS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebdriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		RemoteWebDriver driver=new ChromeDriver();
		/*driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		Thread.sleep(2000);*/
		driver.get("https://www.myntra.com/");
		
		
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("sneakers");
		driver.findElement(By.xpath("//a[@class=\"desktop-submit\"]")).click();
		
		List<WebElement> element=driver.findElements(By.xpath("//span[@class=\"product-discountedPrice\"]"));
		System.out.println(element);
		
	
		
		}

}
