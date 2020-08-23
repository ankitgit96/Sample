package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rightclkoperation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		driver.get("https:/www.google.com");
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='gb_h gb_i']//a[@class='gb_g']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		
		//act.sendKeys("T").perform();
	}
}
