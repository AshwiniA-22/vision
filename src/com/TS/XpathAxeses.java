package com.TS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class XpathAxeses {
	public static void main(String[] args) {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

		// Absolute Xpath of search bar
		// driver.findElement(By.xpath("/html/body/div/div/div/header/div[2]/div[3]/input")).sendKeys("puma");

		// Xpath by Axeses of search bar
		driver.findElement(By.xpath("//div[@class=\"desktop-query\"]/child::input")).sendKeys("puma",Keys.ENTER);

		// Absolute xpath of search icon 
		//driver.findElement(By.xpath("/html/body/div/div/div/header/div[2]/div[3]/a")).click();

		
		//xpath by axesses of search icon 
		//span[@class="myntraweb-sprite desktop-iconSearch sprites-search"]/parent::a
	}

}
