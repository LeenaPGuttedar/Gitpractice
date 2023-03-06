package com.SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {


public static void main(String[] args) throws InterruptedException {
	//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     WebElement element ;
     driver.navigate().to("https://www.amazon.com");
	//WebDriver driver = new ChromeDriver();
        // driver.findElement(By.id("email")).sendKeys("leenaguttdar2@gmail.com");
         //driver.findElement(By.id("pass")).sendKeys("Smartcard_123");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi mobile");
       // driver.findElement(By.className("_3704LK")).sendKeys("mobile","redmi 5g");
        // driver.findElement(By.name("").cssSelector(By.);
         //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
   //  driver.getTitle();
        //  driver.getPageSource();
        // driver.switchTo().window("https://www.carwale.com");
     //System.out.println("the current url is"+ driver.getCurrentUrl());
   // System.out.println("the Page tital is"+ driver.getTitle());
    // System.out.println("page getwindow handle is"+ driver.getWindowHandles());
    // System.out.println("page getwindow handle is"+ driver.getWindowHandle());
     //Thread.sleep(5000);
    // driver.close();
   //  driver.quit();
       //*[@id="u_0_2_1B"]/div[1]/div[2]
         
       //*[@id="u_0_5_KL"]
     
        driver.navigate().refresh();
  }
//*[@id="s-refinements"]/div[1]/ul/li[1]/span/a/div/label/i

}
