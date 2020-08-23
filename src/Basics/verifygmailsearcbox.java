package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifygmailsearcbox {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	//identify search box
	WebElement wb= driver.findElement(By.xpath("//input[@type='text']"));
	String actdefaultvalue=wb.getAttribute("placeholder");
	System.out.println(actdefaultvalue);
	
	//identify color
	String actcolor=wb.getCssValue("background-color");
	System.out.println(actcolor);
	
	//capture the size of editbox
	Dimension dem=wb.getSize();
	System.out.println(dem.getHeight());
	System.out.println(dem.getWidth());
	
	//capture location of edit box
	Point p=wb.getLocation();
	System.out.println(p.getX());
	System.out.println(p.getY());
	
	wb.sendKeys("Shoes");
	
	driver.close();
}
}
