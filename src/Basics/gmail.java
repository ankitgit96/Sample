package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		String exppage="Gmail";
		String actpageTitle=driver.getTitle();
		System.out.println(actpageTitle);
		if(exppage.equals(actpageTitle)) {
			System.out.println("login page is displayed");
		}
		else {
			
		
				System.out.println("login page is displayed");
			}
		driver.quit();
		}

	}


