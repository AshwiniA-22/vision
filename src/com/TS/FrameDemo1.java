package com.TS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FrameDemo1 {
	

	
	public static void main(String[] args) throws InterruptedException {
		
	
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.testingshastra.com/parent-window/");
	driver.manage().window().maximize();
	
Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("ashwini");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("avhad");
	
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//button[@name=\"ok-btn\"]")).click();
	
	String web=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
	System.out.println(web);
	}
}
