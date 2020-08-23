package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailvalidate {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//validation for page title
	driver.get("https://www.gmail.com");
	
	String exppage="Gmail";
	
	String actpage=driver.getTitle();
	System.out.println(actpage);
	
	if(exppage.equals(actpage)) {
		System.out.println("validation is pass");
	}
	else {
		System.out.println("validation is failed");
	}
	
	//validation for error msg
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abs");
	
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	String exppage1="Couldn't find your Google Account";
	
	String actstatement=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
	System.out.println(actstatement);
	
	if(exppage1.equals(actstatement)) {
		System.out.println("validation for error msg is pass");
	}
	else {
		System.out.println("validation for error msg is failed");
		
	}
	driver.close();
	System.out.println("test is pass");
}
}
