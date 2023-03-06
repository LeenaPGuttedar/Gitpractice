package com.robotAction;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotbyRobot {
	public static void main(String[] args) throws AWTException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Robot robot = new Robot();
		java.awt.Dimension scrnsize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(scrnsize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		File file = new File("C:\\Users\\Shree\\eclipse-workspace\\First Selenium\\ScreenShot\\Robotshot.jpg");
		ImageIO.write(source, "jpg", file);
	}

}
