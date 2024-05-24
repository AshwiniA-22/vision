package com.TS.MyPrograms;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageSS {

	
	public void fullPageScreenShot() {
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://www.meesho.com/");
		AShot ashot =new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot sc=ashot.takeScreenshot(driver);
		BufferedImage img= sc.getImage();
		//ImageIO.write(img, "jpg", new File("usingashot.jpg"));
		

	}
}
