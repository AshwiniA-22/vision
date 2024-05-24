package com.TS.MyPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingNotifications {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito","--start-maximized");
		RemoteWebDriver driver = new ChromeDriver(option);
		driver.get("https://www.lokmat.com/");
	}
}
