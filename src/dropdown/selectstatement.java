package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectstatement {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().fullscreen();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver, 40);
	
	driver.get("https:/www.facebook.com");
	
	driver.findElement(By.xpath("//a[@role='button']")).click();
	WebElement wb = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Select sel=new Select(wb);
	sel.selectByVisibleText("Apr");
	
	WebElement wb1 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Select sel1=new Select(wb1);
	sel1.selectByVisibleText("1947");
	
}
}
