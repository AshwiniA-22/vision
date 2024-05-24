package com.TS.MyPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UploadFile {
	
	/*public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.testingshastra.com/file-upload-assignment/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));
		driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys("C:\\Users\\User\\Downloads\\Ashwini_Testing22.pdf");*/
	//}

	
	public static void fileUploadsingRobotClass() throws AWTException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.testingshastra.com/file-upload-assignment/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));
		
		WebElement button1= driver.findElement(By.xpath("//input[@name=\"file\"]"));
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", button1);
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss=new StringSelection("C:\\Users\\User\\Downloads\\Ashwini_Testing22.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void fileUploadUsingAutoIt() throws IOException, InterruptedException {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.testingshastra.com/file-upload-assignment/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));
		
		driver.findElement(By.xpath("//input[@type=\"File\"]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\User\\Downloads\\fileupload.exe");
		Thread.sleep(2000);

	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		fileUploadUsingAutoIt();
	}
}
