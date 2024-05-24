package com.TS;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class KeyboardOperation {

	public static void handlingKBAndMouse() throws AWTException {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);

		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);

		robo.mouseMove(1000, 600);

	}

	public static void screenShotUsingRobot() throws AWTException, IOException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Robot robo = new Robot();

		Rectangle rect = new Rectangle();
		rect.height = 1000;

		rect.width = 1000;
		BufferedImage image = robo.createScreenCapture(rect);

		File outputfile = new File("image.jpg");
		ImageIO.write(image, "jpg", outputfile);

	}

	public static void main(String[] args) throws AWTException, IOException {
		screenShotUsingRobot();
	}

}
