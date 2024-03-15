package org.openqa.sel;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// WAITS (IMPLICIT, EXPLICIT)
public class SAMPLE2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		String url = "https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("Vaishu");
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		until.sendKeys("Keerthi");
	}
   
}
