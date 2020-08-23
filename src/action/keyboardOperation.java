package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboardOperation {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1/login.do;jsessionid=51mfcg20dhi2k");
		WebElement wb = driver.findElement(By.xpath("//input[@type='text']"));
		wb.sendKeys("admin");
		
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.doubleClick(wb).perform();
		
		Thread.sleep(1000);
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(1000);
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		
	}
}
