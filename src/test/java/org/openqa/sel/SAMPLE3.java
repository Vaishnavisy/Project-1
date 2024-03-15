package org.openqa.sel;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// WEB TABLE
public class SAMPLE3 {
	public static void main (String[]args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> table = driver.findElements(By.tagName("table"));
		for(int i=0; i<table.size();i++) {
			WebElement ttable = table.get(i);
			WebElement tbody = ttable.findElement(By.tagName("tbody"));
			List<WebElement> trows = tbody.findElements(By.tagName("tr"));
			for (int j=0; j<trows.size();j++) {
				WebElement rows = trows.get(j);
//				String text = rows.getText();
				List<WebElement>tdata = rows.findElements(By.tagName("td"));
				for(int k=0; k<tdata.size();k++) {
					WebElement td = tdata.get(k);
					String text1 = td.getText();
//					if(text1.equals("IDFC L")) {
//					System.out.println(text1);
					System.out.println(j);
					System.out.println(k);
//					}
				}
			}
		}
	}

}
