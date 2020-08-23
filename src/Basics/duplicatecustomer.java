package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class duplicatecustomer {
public static void main(String[] args) throws Throwable {
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
	
	String expmsg="User \"ankitkumar\" is already registered. Please choose other username.";
	String actmsg=driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
	
	if(expmsg.equals(actmsg)) {
		System.out.println("duplicate name is exist");
	}
	else {
		System.out.println("duplicate name is not exist");
	}
	driver.close();
}
}
