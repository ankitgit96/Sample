package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
public static void main(String[] args) throws Throwable {
	
	
	//user account has been created
	//by giving firstname,lastname
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do;jsessionid=hut25tld3ijz");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Users")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	driver.findElement(By.name("username")).sendKeys("ankitkumar");
	
	driver.findElement(By.name("passwordText")).sendKeys("ankitkumar45");
	driver.findElement(By.name("passwordTextRetype")).sendKeys("ankitkumar45");
	
	driver.findElement(By.name("firstName")).sendKeys("AnkitAk");
	driver.findElement(By.name("lastName")).sendKeys("KumarKR");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String expmsg="User account has been successfully created.";
	String actmsg= driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
	System.out.println(actmsg);
	if (expmsg.equals(actmsg)) {
		System.out.println("account is created");
	}
	else {
		System.out.println("account is not created");
	}
	driver.findElement(By.xpath("//a[@class='logout']")).click();
	driver.close();
}
}
