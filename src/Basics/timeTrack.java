package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class timeTrack {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1/login.do;jsessionid=hut25tld3ijz");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Time-Track")).click();
		driver.findElement(By.linkText("View Time-Track")).click();
		
		WebElement wb= driver.findElement(By.name("usersSelector.selectedUser"));
		
		Select sel=new Select(wb);
		sel.selectByValue("2");
		
		driver.findElement(By.id("cpSelector.cpButton_middleRightCell")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("closeButton")).click();;
//		WebElement wb1=driver.findElement(By.id("cpSelector.cpButton_middleRightCell"));
		
//		Select sel1=new Select(wb1);
//		sel1.selectByValue("2");
		
		
		//sel.selectByIndex(1);
		//sel.selectByVisibleText("Kumar, Ankit (ankit)");
		//driver.findElement(By.linkText("Kumar, Ankit (ankit)")).click();
		
		//driver.close();
		//driver.quit();

	}

}
