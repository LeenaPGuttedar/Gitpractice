package com.robotAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {
	private static void dragAndDrop() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//h5[contains(text(),'Automation testing (java) ')]"));
		WebElement to = driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).perform();
		
	}
	public static void main(String[] args) {
		dragAndDrop();
	}
		
	}


