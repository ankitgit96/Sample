import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiselectdropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/dell/Desktop/html/dropdownsub.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		WebElement wb=driver.findElement(By.name("sel"));
		Select sel=new Select(wb);
		List<WebElement> lst=sel.getOptions();
		String expopt="testing";
		
		
		
		for(WebElement wb1:lst) {
			
		
		String actualopt=wb1.getText();
		
		System.out.println(actualopt);
		if (actualopt.contains(expopt)) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
	}

	}}
