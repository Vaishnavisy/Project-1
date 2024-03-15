package org.openqa.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//DROP DOWN (SELECT BY - INDEX, VALUE, VISIBLE TEXT)
public class SAMPLE {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.xpath("//Select[@id = \"first\"]"));
		Select s = new Select (drop);
		s.selectByIndex(3);
		s.selectByValue("Google");
		s.selectByVisibleText("Bing");
		
//		List<WebElement> options = s.getOptions();
//		for (int i=0; i<options.size(); i++) {
//			WebElement actual = options.get(i);
//			String text = actual.getText();
//			System.out.println(text);
			
		List<WebElement> options1 = s.getOptions();
		for(int j=options1.size()-1;j>=0;j--) {
		      WebElement actual1 = options1.get(j);
			String text1 = actual1.getText();
			System.out.println(text1);
		}
	}

}
