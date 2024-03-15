import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//ACTIONS(DRAG AND DROP), SCREENSHOT
public class cls5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		String url = "https://demo.guru99.com/test/drag_drop.html";
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),\"BANK\")]"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
//		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
//		WebElement target1 = driver.findElement(By.xpath(""));
//		
//		WebElement src2 = driver.findElement(By.xpath(""));
//		WebElement target2 = driver.findElement(By.xpath(""));
//		
//		WebElement src3 = driver.findElement(By.xpath(""));
//		WebElement target3 = driver.findElement(By.xpath(""));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, target).perform();
//		ac.dragAndDrop(src1, target1).perform();
//		ac.dragAndDrop(src2, target2).perform();
//		ac.dragAndDrop(src3, target3).perform();
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sc = t.getScreenshotAs(OutputType.FILE);
		File fl = new File ("C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\src\\test\\resources\\DragandDropScreenshot.png");
		FileUtils.copyFile(sc, fl);
		
	}
 
}
