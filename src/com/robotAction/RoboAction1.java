package com.robotAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboAction1 {
	
	public static void keyboardHandlingRobot() throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		robo.keyPress(keyEvent.s)
		
		robo.mouseWheel(20);
	}
	
	public static void mouseHandlingUsingActions() {
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("http://www.testingshastra.com");
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.contextClick().perform();//To right click
		action.
	//	action.keyDown(Keys.DELETE);
		//action.keyUp(Keys.DELETE);
		//WebElement source = driver.findElement(By.xpath("//h5[contains(text(),'Automation testing (Python)')]"));
		//WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		//action.clickAndHold(source).perform();
		//action.moveToElement(target).perform();
		action.scrollByAmount(0, 500).perform();
	}
	
	
	public static void main(String[] args) throws AWTException {
		//keyboardHandlingRobot();
		mouseHandlingUsingActions();
	}

}
