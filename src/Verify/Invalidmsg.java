package Verify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidmsg {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
	String exppage="Gmail";
	
	String actpage=driver.getTitle();
	System.out.println(actpage);
		if (exppage.equals(actpage)) {
			System.out.println("Validation is correct");
		}
		else {
			System.out.println("Validation is incorrect");
		}
		
		//Step 2 invalid id
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abs123");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		driver.quit();
	}

}
