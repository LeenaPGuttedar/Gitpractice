package com.JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavascriptExe1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingShastra.com");
		//driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.querySelector(\"a[href='/assignments']\").click()\r\n");
		jse.executeScript("document.querySelector(\"a[href='/assignments/drag-and-drop']\").click()\r\n");
	//	int scroll = 1500;
		//jse.executeScript("window.scrollBy(0,"+scroll+")");
		jse.executeScript("window.scrollBy(0,1500)");
		jse.executeScript("window.scrollBy(0,arguments[2])",1500,350,1200,1000);    //paramiterise	
		String text = (String) driver.executeScript("return document.querySelector(\"a[href='/assignments']\").text");
		System.out.println(text);
	    
	}

}
