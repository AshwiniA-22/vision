package com.TS.MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author Ashwini Avhad
 */
public class MouseOperationUsingActions {

	public static void mouseHandlingUsingActions() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//a[@href=\"/shop/women\"])[1]"));
		act.moveToElement(element);
		act.perform();
		act.doubleClick(element);
	}
	
	public static void clickAndHoldpByHtmlgoodies() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act2= new Actions(driver);
		WebElement src= driver.findElement(By.xpath("(//div[starts-with(text(),\"Oslo\")])[1]"));
		
		WebElement dest= driver.findElement(By.xpath("//div[starts-with(text(),\"Spain\")]"));
		act2.clickAndHold(src).moveToElement(dest).release().perform();

	}

	public static void dragAndDrop() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act2= new Actions(driver);
		WebElement src= driver.findElement(By.xpath("(//div[starts-with(text(),\"Stockholm\")])[1]"));
		
		WebElement dest= driver.findElement(By.xpath("(//div[starts-with(text(),\"Denmark\")])[1]"));
		act2.dragAndDrop(src, dest).perform();

	}
	
	
	public static void main(String[] args) {
		dragAndDrop();
	}
}
