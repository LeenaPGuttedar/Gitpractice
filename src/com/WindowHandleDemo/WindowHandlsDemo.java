package com.WindowHandleDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlsDemo {

	public static void handlingWindow() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Downloads/HandlingMultipleWindows.html");
		driver.findElement(By.tagName("button")).click();

		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> I1 = allWindow.iterator();

		while (I1.hasNext()) {

			String window = I1.next();
			// for(String window : allWindow) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if (title.contains("First")) {
				driver.findElement(By.tagName("button")).click();
				String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				System.out.println(text);

				driver.switchTo().window(window);
				String title1 = driver.getTitle();
				if (title1.contains("Second")) {
					driver.get("file:///C:/Users/Shree/Downloads/Second.html");
					driver.findElement(By.tagName("button")).click();
					String text1 = driver.findElement(By.xpath("//p[contains(text(),'You are in Second window')]")).getText();
					System.out.println(text1);
					break;
				}
				
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		handlingWindow();
	}
}
