package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownflipkart {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement wb = driver.findElement(By.xpath("//span[@text='Sports, Books & More']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(wb);
		act.perform();
		
		driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).click();
	}
}
