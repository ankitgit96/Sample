package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//give userid and click next
	driver.get("https://www.gmail.com");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ankitkumarkarn1996");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	Thread.sleep(2000);
	
	//give password and click next
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ankit96kumar");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	//driver.close();
}
}
