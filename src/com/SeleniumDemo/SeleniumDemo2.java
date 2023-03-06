package com.SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemo2 {

		public static void main(String[] args)  
		{
			//System.setProperty("webdriver.chrome,driver","D:\\Larkspur22A\\Sample\\Gitsession\\Driver\\chromedriver.exe");
			RemoteWebDriver driver = new ChromeDriver();
			driver.get("https://money.rediff.com/gainers");
			driver.manage().window().maximize();
		    //driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Mayuri");
		    //driver.findElement(By.xpath("(//input[starts-with(@type,'text')])[1]")).sendKeys("Shoes");//Functions Of Relative xpath
		    //driver.findElement(By.xpath("//p[starts-with(text(),'Chitrarekha Refined Sarees')]")).click();
			//driver.findElement(By.xpath("//p[text()='Elegant Versatile Women Handbags']")).click();
			//driver.findElement(By.xpath("(//p[contains(@class,'sc-gsDJrp lbcjjc NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ctZiZK NewProductCardstyled__StyledDesktopProductTitle-sc-6y2tys-5 ctZiZK')])[1]")).click();
			//driver.findElement(By.xpath("/html/body/div/div/div/header/div[2]/nav/div/div[2]/div/a")).click();
			//driver.findElement(By.xpath("(//span[contains(text(),'Kids')])[1]")).click();
			String text = driver.findElement(By.xpath("(//a[contains(text(),'Forex')])[1]")).getText();
			System.out.println(text);
			
					
					//Thread.sleep(2000);
					//for Self XPATH axeses
					//driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/tools/forex\"]/self::a")).click();
					//For Parent XPATH Axeses Forex
					//driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/tools/forex\"]/parent::li")).click();
					//For ancestor XPATH Investment Toool
					//driver.findElement(By.xpath("//a[@href=\"//money.rediff.com/tools/what-if\"]/ancestor::ul/child::li")).click();
					
					//********************Childs************************************
					List<WebElement> childs= driver.findElements(By.xpath("//a[contains(text(),'Investment Tool')]/ancestor::ul/child::li"));
					System.out.println("Number of childs"+" "+childs.size());
					//driver.close();
					//******************Desecndonts**********************************
					List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Narmada Gelatines Lt')]/ancestor::tr/descendant::*"));
					System.out.println("no of descendants"+" " +descendants.size());
					
					List<WebElement> followings =driver.findElements(By.xpath("//a[contains(text(),'Narmada Gelatines Lt')]/ancestor::tr/following::tr"));
					System.out.println("no of followings"+" " +followings.size());
					
					List<WebElement> followingsibling =driver.findElements(By.xpath("//a[contains(text(),'Narmada Gelatines Lt')]/ancestor::tr/following-sibling::tr"));
					System.out.println("no of following-sibling"+" " +followingsibling.size());
					
					//List<WebElement> preceding =driver.findElements(By.xpath("//a[contains(text(),'Narmada Gelatines Lt')]/ancestor::tr/preceding::tr"));
					//System.out.println("no of preceding"+" " +preceding.size());
					
					List<WebElement> preceding=driver.findElements(By.xpath("//a[@href=\"//money.rediff.com/companies/narmada-gelatines-lt/11100008.08\"]/ancestor::tr/preceding::td"));
					System.out.println("no of preceding"+" " +preceding.size());
					for(WebElement e:preceding) {
						//System.out.println(e.getText()+"\t");
						String str = e.getText();
						System.out.println(str);
					}



			driver.close();
			

}
}
