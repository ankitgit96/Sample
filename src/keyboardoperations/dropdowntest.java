package keyboardoperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.util.List;

public class dropdowntest {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver, 40);
	
	driver.get("C:/Users/dell/Desktop/html/dropdownsub.html");
	
	WebElement wb = driver.findElement(By.xpath("//select[@name='sel']"));
	Select sel=new Select(wb);
	List<WebElement> lst=sel.getOptions();
	System.out.println(lst.size());
	for(WebElement wb1:lst) {
		System.out.println(wb.getText());
	}
	driver.close();
}
}
