package com.AlertPopUpDropdownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectlist {
	public static void handlingDropdown() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drop-down");
		WebElement list = driver.findElement(By.xpath("//select[@class='single-select']"));
		Select select = new Select(list);
		select.selectByVisibleText("August");
		select.selectByIndex(3);
		select.selectByValue("Feb");
		
	}
	public static void main(String[] args) {
		handlingDropdown();
	}

}
