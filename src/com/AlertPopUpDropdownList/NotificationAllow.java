package com.AlertPopUpDropdownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationAllow {
	public static void notifictionHandling() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications","--incognito");
		//option.addArguments("--incognito");
		option.setAcceptInsecureCerts(true);
		//option..s
		ChromeDriver driver = new ChromeDriver(option);
		//driver.get("https://www.ajio.com/");
		//driver.get("https://www.moneycontrol.com/");
		driver.get("https://mahadbtmahait.gov.in/Login/Login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		
		
	}

	public static void main(String[] args) {
		notifictionHandling();
	}

}
