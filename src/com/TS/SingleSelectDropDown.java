package com.TS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	
	public static void main(String[] args) {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement single=driver.findElement(By.xpath("//select[@id=\"drop1\"]"));
		
		Select sel=new Select(single);
		
		sel.selectByValue("abc");
		sel.selectByVisibleText("doc 4");
		
	
	}

}
