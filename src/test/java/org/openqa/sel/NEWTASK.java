package org.openqa.sel;

import java.util.*;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NEWTASK {
	public static void main (String[]args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.name("q")).sendKeys("Lenovo Laptops",Keys.ENTER);
        
        List<WebElement> things = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> things1 = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for (int i=0;i<things.size(); i++) {
			WebElement laptop = things.get(i);
			WebElement price = things1.get(i);
			String text1 = price.getText();
			String text = laptop.getText();
		
		Map<String, String> m = new TreeMap<>();
		m.put(text, text1);
		for (Map.Entry<String,String>entry:m.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + value);
		}
		}
           
		

	}

}
