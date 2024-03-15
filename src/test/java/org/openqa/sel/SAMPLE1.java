package org.openqa.sel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//DROP DOWN (IS MULTIPLE, DESELECT, GET ALL SELECTED OPTION, GET FIRST SELECTED OPTION)
public class SAMPLE1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.xpath("//Select[@id = \"first\"]"));
		Select s = new Select (drop);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		WebElement down = driver.findElement(By.xpath("//Select[@id = \"second\"]"));
		Select sl = new Select (down);
		sl.selectByIndex(2);
		sl.selectByVisibleText("Pizza");
		sl.selectByValue("donut");
		sl.selectByVisibleText("Bonda");
		Thread.sleep(2000);
		
		boolean multiple1 = sl.isMultiple();
		System.out.println(multiple1);
		
//		sl.deselectByValue("pizza");
//		sl.deselectAll();
		List<WebElement> allvalues = sl.getAllSelectedOptions();
		for(int i=0; i<allvalues.size();i++) {
			WebElement actual1 = allvalues.get(i);
			String text1 =actual1.getText();
			System.out.println(text1);
		}
		WebElement firstSelectedOption = sl.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
