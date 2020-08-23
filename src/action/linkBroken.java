package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class linkBroken {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	//WebElement wb = driver.findElement(By.linkText("Sports, Books & More"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	//act.moveToElement(driver.findElement(By.linkText("Sports, Books & More"))).build().perform();
	WebElement elem= driver.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_']//span[@class='_1QZ6fC _3Lgyp8'])[7]"));
	act.moveToElement(elem).build().perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']//a[@title='Chocolates']")).click();
	
	
	
	
	
	
	
	
}
}
