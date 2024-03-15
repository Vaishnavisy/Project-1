package org.openqa.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NEWTASK3 {
	public static void main (String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Apple Laptops" , Keys.ENTER);
	}

}
