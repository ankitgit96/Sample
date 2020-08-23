package Autosuggesteditbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
}}
