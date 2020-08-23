package keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentWait {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(5,TimeUnit.SECONDS);
		wait.withTimeout(60,TimeUnit.SECONDS);
		// wait.until(ExpectedCondition.elementToBeClickable(By.name("")));
	}

}
