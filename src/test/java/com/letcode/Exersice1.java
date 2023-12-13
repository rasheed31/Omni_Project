package com.letcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exersice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
	//driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	WebElement name =  driver.findElement(By.id("fullName"));
			name.sendKeys("Rasheed Abdur Rahman");
			Thread.sleep(3000);
//			 driver.findElement(By.id("join")).sendKeys("  man",Keys.TAB);
//			String ff= driver.findElement(By.id("getMe")).getAttribute("value");
//			System.out.println(ff);
//			driver.findElement(By.id("clearMe")).clear();
//			boolean bb=driver.findElement(By.id("noEdit")).isEnabled();
//			System.out.println(bb);
//	String isread=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
//	System.out.println(isread);
	driver.navigate().to("https://letcode.in/windows");
	driver.findElement(By.id("home")).click();
     String url=driver.getCurrentUrl();
	System.out.println("current url "+ url);
Set<String> windows =	driver.getWindowHandles();	
List<String> list = new ArrayList<String>(windows);
     driver.switchTo().window(list.get(1));
     String url1 = driver.getCurrentUrl();
     System.out.println(url1);
     String title =driver.getTitle();
	System.out.println("Title of page is " +title);
	driver.switchTo().window(list.get(0));
	driver.close();
	
	
	
	}

}
