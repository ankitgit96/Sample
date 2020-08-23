package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class draganddrop {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		driver.get("https://material.angular.io/cdk/drag-drop/overview");
		
		WebElement dwb= driver.findElement(By.xpath("//div[@class='cdk-drag example-box']"));
		WebElement drwb=driver.findElement(By.xpath("//div[@class='example-boundary']"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(dwb).moveToElement(drwb).release().build().perform();
		
		driver.close();
	}

}
