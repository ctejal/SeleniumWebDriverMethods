package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class conditionalmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		driver.manage().window().maximize();
		
		//isDispalyed()
		//WebElement logo = driver.findElement(By.xpath("/html/body/div[7]/header/nav/div[2]/a/img"));
		//System.out.println(logo.isDisplayed());
		
		//another way of isDisplayed()
		boolean status = driver.findElement(By.xpath("/html/body/div[7]/header/nav/div[2]/a/img")).isDisplayed(); 
		System.out.println("Display Status is:" + status);
		
		//isEnabled()
		boolean st=driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled();
		System.out.println("Enable status is:" +st);

}
}