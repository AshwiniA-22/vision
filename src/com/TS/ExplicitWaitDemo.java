package com.TS;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ExplicitWaitDemo {
	
	public static void explicitWait() {
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class,ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		wait.until(ExpectedConditions.invisibilityOf(button));
		
		
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Ashhhh");
		
		
		WebElement clickme=driver.findElement(By.xpath("//button[@id=\"btn-1\"]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(clickme)).click();
		
		String msg=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(msg);
		
		

	}

public static void main(String[] args) {
	ExplicitWaitDemo.explicitWait();
}
}
