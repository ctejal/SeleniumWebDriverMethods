package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class getmethods {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		//get(url)-opens the url in the browser
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		
		//getTitle()-returns the title of the page
		System.out.println(driver.getTitle());
		
		//returns the current URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//returns ID of the single browser window
		//String id = driver.getWindowHandle();
		//System.out.println("Window ID:" + id);
		
		//returns Id's of the multiple browsers
		driver.findElement(By.linkText("Explore Now")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
	}

}
  