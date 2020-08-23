package Basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sessionid {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com");
		
		//session id
		String windowsessionid=driver.getWindowHandle();
		System.out.println(windowsessionid);
		
		//for full screen of the opened link
		driver.manage().window().fullscreen();
		
		//for changing the dimension of webpage
		Dimension dem=new Dimension(300, 300);
		driver.manage().window().setSize(dem);
		//driver.close();
	}
}
