package com.TS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[1]")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Avhad");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("8830042617");
		driver.findElement(By.xpath("//input[@data-type=\"password\"]")).sendKeys("Hello@1234");

		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));

		Select sel = new Select(day);
		sel.selectByValue("22");

		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));

		Select selmon = new Select(month);
		selmon.selectByVisibleText("Sep");

		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));

		Select selyear = new Select(year);
		selyear.selectByValue("2004");

		System.out.println(driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).isSelected());

		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();

		System.out.println(driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).isSelected());

	}

}
