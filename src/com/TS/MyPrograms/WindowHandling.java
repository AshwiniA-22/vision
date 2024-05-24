package com.TS.MyPrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.testingshastra.com/multiple-window-handling-assignment/");
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class,ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		wait.until(ExpectedConditions.invisibilityOf(button));
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		Set <String> allhandles=driver.getWindowHandles();
		
		for (String handle : allhandles) {
			if(handle.equalsIgnoreCase(parentwindow)) {
				
			}else {
				driver.switchTo().window(handle);
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[contains(text(), \"Click Me\")]")).click();
				
				String msg=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
				System.out.println(msg);
			}
			
		}
		
		/*
		 * driver.findElement(By.xpath("//button[contains(text(), \"Click Me\")]")).
		 * click();
		 * 
		 * String msg=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		 * 
		 * System.out.println(msg);
		 */
	}	

}
