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
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotByRobot1 {
	public static void main(String[] args) throws IOException, AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https:/www.ajio.com");
		driver.manage().window().maximize();
		
		Robot robo =new Robot();
		java.awt.Dimension scrnsize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(scrnsize);
		BufferedImage bf = robo.createScreenCapture(rectangle);
		
		File file = new File("C:\\Users\\Shree\\eclipse-workspace\\First Selenium\\ScreenShot\\Robosot.jpg");
		ImageIO.write(bf, "JPG", file);
	    
		
		
	}

}
