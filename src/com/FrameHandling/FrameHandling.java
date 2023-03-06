package com.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void handlingFrame() {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Shree/Desktop/Frames/FrameDemo.html");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Leena");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Guttedar");
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//button[@name='ok-btn']")).click();
	String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println(msg);
	
	}
	
	public static void main(String[] args) {
		handlingFrame();
	}

}
