package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiselectdropdown {

	public static void main(String[] args) {
		 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		driver.get("C:/Users/dell/Desktop/html/RadioButton.html");
		
		WebElement wb=driver.findElement(By.name("sel"));
		
		Select sel=new Select(wb);
		boolean boo=sel.isMultiple();
		int count=sel.getOptions().size();
		if (boo) {
			
			for (int i = 0; i < count; i++) {
			
				sel.selectByIndex(i);
			}
			sel.deselectAll();
		}
		
	}
}
