package com.AlertPopUpDropdownList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void handlingAlerts() {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/simple-alert");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Leena");
		driver.findElement(By.xpath("//button[@class='alert-btn']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		}
	public static void main(String[] args) {
		handlingAlerts();
		
	}

}
