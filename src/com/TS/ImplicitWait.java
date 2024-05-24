package com.TS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ImplicitWait {
	
	
	public void implicitWaitDemo() {
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("ashwini");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[contains(text(),\"Click Me\")]")).click();

		
		String text=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(text);
	}
	
	
	public static void main(String[] args) {
		
		///html/body/div[2]/div[2]/div[2]/div/div/div/article/section/section/div/section/div/div/div/div/div/div/div/ul/li/h4[3]/input
		
		
		new ImplicitWait().implicitWaitDemo();
	}

}
