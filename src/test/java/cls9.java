//import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

//WINDOW HANDLING

public class cls9 {
	public static void main (String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("The Secret", Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).click();
		String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(text);
		
		String current = driver.getWindowHandle();
		System.out.println(current);
		Set<String> s = driver.getWindowHandles(); 
		System.out.println(s);
		
		
//		List<String> l = new ArrayList<>;
//		driver.switchTo().window(l.get(3));
//		String text = driver.findElement(By.xpath("")).getText();
//		System.out.println();
	}
}
