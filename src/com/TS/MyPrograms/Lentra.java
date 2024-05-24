package com.TS.MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Lentra {
	
	public static void main(String[] args) {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://ssgpreprod.serviceurl.in/sme/4139/tatamotors/#/login");
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("ashwini");
		driver.findElement(By.xpath("//input[@id=\"login2\"]")).sendKeys("sai1234");
		
	}

}
