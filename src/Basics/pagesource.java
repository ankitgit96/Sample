package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.gmail.com");
	
	//get the title of page
	String getpageTitle=driver.getTitle();
	System.out.println(getpageTitle);
	
	//capture current page url
	String getpageurl=driver.getCurrentUrl();
	System.out.println(getpageurl);
	
	//capture htmlcode
	String htmlsource=driver.getPageSource();
	System.out.println(htmlsource);
	
	driver.quit();
}
}
