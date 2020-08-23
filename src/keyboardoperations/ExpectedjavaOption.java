package keyboardoperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectedjavaOption {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	WebDriverWait wait= new WebDriverWait(driver, 40);
	
	driver.get("C:/Users/dell/Desktop/html/dropdownsub.html");
	
	WebElement wb = driver.findElement(By.xpath("//select[@name='sel']"));
	
	Select sub = new Select(wb);
	List<WebElement> lst=sub.getOptions();
	
	String expopt="java";
	boolean flag= false;
	
	for(WebElement wb1:lst) {
		String actopt=wb.getText();
		if(actopt.equals(expopt)) {
			sub.selectByVisibleText(expopt);
			flag=true;
			break;
		}}
	
	if(flag==true) {
		System.out.println("pass");
		}
	else {
		System.out.println("false");
	}
	}
	
}
