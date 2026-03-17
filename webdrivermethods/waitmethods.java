package webdrivermethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitmethods {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//implicitlywait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.nykaa.com/");
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[1]/div/div[2]/div[1]/div/form/input")).sendKeys("nailpaint");
//		driver.close();
		
		//explictwait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");
		WebElement txt = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[1]/div/div[2]/div[1]/div/form/input")));
		txt.sendKeys("lipgloss");
		
		
	}
}
