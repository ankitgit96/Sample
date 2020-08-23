package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//navigate.to method is refer browser history 
	driver.navigate().to("https://amazon.com");
	
	//go to the link
	driver.findElement(By.linkText("Your Amazon.com")).click();
	
	//go back page
	driver.navigate().back();
	
	//go to next page
	driver.navigate().forward();
	
	//refresh the page
	driver.navigate().refresh();
	
	//delete all cookies
	driver.manage().deleteAllCookies();
	
	driver.close();
}
}
