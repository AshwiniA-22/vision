package com.TS.MyPrograms;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageScrollUsingActions {
	
	public static void scrollUpDown() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_UP);
		act.sendKeys(Keys.F5).perform();

	}
	public static void main(String[] args) {
		scrollUpDown();
	}

}
