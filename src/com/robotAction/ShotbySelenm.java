package com.robotAction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ShotbySelenm {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/");
		driver.manage().window().maximize();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file,new File("C:\\Users\\Shree\\eclipse-workspace\\First Selenium\\ScreenShot\\firstScreenshot.jpg"));
		
	}

}
