package org.openqa.sel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NEWTASK1 { 

    public static void main(String[] args) throws Throwable 
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.name("q")).sendKeys("Apple Laptop",Keys.ENTER);
        
        List<WebElement> product = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
 
    	 Map<String, String> h = new HashMap<>();
    	 for (int i = 0; i < product.size(); i++) 
    	 {
             String productName = product.get(i).getText();
             String productPrice = price.get(i).getText();          
             h.put(productName, productPrice);
             
    	 } 
	     File f = new File("C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\Vaishu.xlsx");
	     FileOutputStream f1 = new FileOutputStream(f);
	     HSSFWorkbook w = new HSSFWorkbook();
	     HSSFSheet s = w.createSheet("Laptops");
	       	
	     int r = 0;
	            
	     for (Map.Entry<String, String> entry : h.entrySet()) {
	        HSSFRow row = s.createRow(r++);
	        row.createCell(0).setCellValue(entry.getKey());
	        row.createCell(1).setCellValue(entry.getValue());
	        System.out.println(entry);
	     }
	     w.write(f1);
	     w.close();
	     
	        	
	     driver.quit();
    }
}




