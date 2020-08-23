package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectmulsub {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		driver.get("C:/Users/dell/Desktop/html/dropdownsub.html");
		
		WebElement wb=driver.findElement(By.xpath("//select[@name='sel']"));
		
		Select sel=new Select(wb);
		//check whether select is multiple
		boolean stat=sel.isMultiple();
		//count the number of element
		int count=sel.getOptions().size();
		
		if (stat) {
			
			for(int i=0;i<count;i++) {
				//select all option
				sel.selectByIndex(i);
				
			}
			sel.deselectAll();
			
			driver.close();
		}
		
	}
}
