package webdrivermethods;

import org.openqa.selenium.edge.EdgeDriver;

public class navigatemethods {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		//navigate().to(url)
		driver.navigate().to("https://www.nopcommerce.com/en");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//navigate().refresh();
		driver.navigate().refresh();
	}
}
