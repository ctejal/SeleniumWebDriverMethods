package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class browsermethods {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("DSA")).click();
		Thread.sleep(3000);
		
		//driver.close();
		driver.quit();
	}
}
