import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("7903140575");
			driver.findElement(By.id("pass")).sendKeys("ankit96kumar");
			driver.findElement(By.xpath("//div[@class='_6ltg']")).click();
			
			driver.findElement(By.xpath("//div[@class='']")).click();
			
	}
}
