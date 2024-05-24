package com.TS.MyPrograms;

import java.security.DomainLoadStoreParameter;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class AlertsHandling {

	public static void simpleAlert() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/simple-alert/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));

		driver.findElement(By.xpath("//input[@id=\"user\"]")).sendKeys("Ashwini");

		driver.findElement(By.xpath("//button[@class=\"card-btn two bold-font\"]")).click();

		Alert alert = driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();

	}
	
	public void confirmationAlert() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/confirmation-alert/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));

		driver.findElement(By.xpath("//button[contains(text(),\"Click\")]")).click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		String msg=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(msg);

	}
	
	
	public void promptAlert() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/prompt/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));
		
		driver.findElement(By.xpath("//button[@class=\"card-btn two bold-font\"]")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("hi");
		alert.accept();
		alert.sendKeys("28");
		alert.accept();
		String msg=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(msg);
	}
	public static void main(String[] args) {
		new AlertsHandling().promptAlert();
	}
}
