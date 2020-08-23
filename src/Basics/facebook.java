package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com");
	
	String x="//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png']";
	boolean img = driver.findElement(By.xpath(x)).isDisplayed();
	if(img) {
		System.out.println("image is displayed");
	}
	else {
		System.out.println("image is not displayed");
	}
	

	boolean rdbtn=driver.findElement(By.id("u_0_6")).isSelected();
	boolean rdbtn1=driver.findElement(By.id("u_0_7")).isSelected();
	boolean rdbtn2=driver.findElement(By.id("u_0_8")).isSelected();
	
	if(rdbtn==false && rdbtn1==false &&rdbtn2==false) {
		System.out.println("radio btn is not selected");
	}
	else {
		System.out.println("radio btn is selected");
	}
	
	driver.close();
}
}
