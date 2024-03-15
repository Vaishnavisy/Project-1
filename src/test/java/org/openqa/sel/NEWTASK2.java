package org.openqa.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
//import java.util.Map.Entry;

	public class NEWTASK2 {
		
	    public static void main(String[] args) {
	    	
	    	WebDriverManager.edgedriver().setup();
	    	WebDriver driver = new EdgeDriver();
	    	driver.get("https://www.flipkart.com/");
	    	
	    	driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
	    	
	        List<WebElement> P1 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	        List<WebElement> P2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	        
	        int totalPrice =0;
	              
	        for(int i=0; i< P1.size();i++) {
	        	String Product = P1.get(i).getText();
	        	String Price = P2.get(i).getText().replaceAll("₹","").replace(",", "");
	        	int productPrice= Integer.parseInt(Price);
	        	Map<String,Integer> m = new HashMap<>();
	        	m.put(Product,productPrice);
	        	for(Map.Entry<String, Integer> a :m.entrySet()) {
	        		System.out.println(a);
	        	}
	        	totalPrice  += productPrice;
	        }
//	        	
	        System.out.println(totalPrice);
//	       
	        }
	        
	        
	    }
	
	
	
//	m.put(productName, productPrice);
//    for(Map.Entry<String,String> entry: m.entrySet()){
//	System.out.println(entry)
	
//	 String r=productPrice.replaceAll("₹,","");
//	 int price = Integer.parseInt(r);
//	 
//	 m.put(productName,r);
    
//System.out.println("TotalPrice : ₹" + totalPrice);
//driver.quit();
	       


