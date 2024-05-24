package com.TS.MyPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollingByJSE {
	
	public static void main(String[] args) {
		/*
		 * RemoteWebDriver driver=new ChromeDriver();
		 * driver.get("https://www.myntra.com/");
		 * 
		 * driver.executeScript("window.scrollBy(0,500)");
		 */
		getTextUsingJS();
	}

	
	public static void getTextUsingJS() {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String text=(String) driver.executeScript("return document.querySelector(\"a[href='/shop/women']\").textContent");
System.out.println(text);
	}
}

