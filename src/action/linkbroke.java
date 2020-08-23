package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linkbroke {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://spicejet.com");
	
	Thread.sleep(2000);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
}
}
