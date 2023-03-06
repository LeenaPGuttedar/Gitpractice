package com.WindowHandleDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



		public class WindowHandleDemo1{
			
		public static void handlingWindow() throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/Shree/Downloads/HandlingMultipleWindows.html");
				driver.findElement(By.tagName("button")).click();
				Thread.sleep(2000);
				
				Set<String> allwindow = driver.getWindowHandles();
				for (String window : allwindow) {
					
					driver.switchTo().window(window);
					//String title = driver.getTitle();
					//if (title.contains("First")) {
					

						driver.findElement(By.tagName("button")).click();
						Thread.sleep(2000);
						//String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
						//System.out.println(msg);
					//	break;

					//} else {
						//continue;
					}

				}

			

			public static void main(String[] args) throws InterruptedException {
				handlingWindow();
			}
		}



