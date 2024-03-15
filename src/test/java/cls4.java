import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//ACTIONS (MOVE TO ELEMENT,DOUBLE CLICK,CONTEXT CLICK), ROBOT
public class cls4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		String url = "https://www.facebook.com/";
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		element.sendKeys("vaishu");
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		a.doubleClick(element).perform();
		a.contextClick(element).perform();
		
		Robot r = new Robot();
		for(int i=0; i<3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_V);
			
			
			
		
	}

}
