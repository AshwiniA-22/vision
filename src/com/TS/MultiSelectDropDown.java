package com.TS;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelectDropDown {

	public static void main(String[] args) {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		WebElement multi = driver.findElement(By.xpath("//select[@id=\"multiselect1\"]"));
		Select sel = new Select(multi);

		
		
		boolean type = sel.isMultiple();
		System.out.println(type);
		
	sel.selectByValue("swiftx");
	sel.selectByVisibleText("Audi");
	List<WebElement> list=sel.getAllSelectedOptions();
	System.out.println(list);
	
	
	
	sel.deselectByValue("swiftx");
	
	boolean gadi=driver.findElement(By.xpath("//option[@value=\"swiftx\"]")).isSelected();
	
	System.out.println(gadi);

	//sel.deselectAll();
	
	
		  
		 //driver.findElement(By.xpath("")); driver.findElement(By.xpath(""));
		 

	}

}
