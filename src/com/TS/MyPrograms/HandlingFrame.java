package com.TS.MyPrograms;

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

public class HandlingFrame {

	public static void frameHandlingDemo() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/parent-window/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("ashwini");
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name=\"fname\"]"))).sendKeys("ashwini");

		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("avhad");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//button[@name=\"ok-btn\"]")).click();
		String msg= driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		frameHandlingDemo();
	}
}
