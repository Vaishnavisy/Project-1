package org.openqa.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAMPLE4 {

		public static void main (String[] args) throws InterruptedException, IOException  {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
			WebElement element = driver.findElement(By.xpath("(//h2[@class='main-3'])[2]"));
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",element);
			js.executeScript("arguments[0].click()",element);
			
			driver.findElement(By.xpath("//p[contains(text(),'I have work experience')]")).click();
			driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Users\\Ashmitha\\OneDrive\\Documents\fileupload.exe");
			
		}

	

}
