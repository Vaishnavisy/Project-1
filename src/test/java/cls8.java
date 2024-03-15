import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//FRAME

public class cls8 {
	public static void main (String[]args) throws Throwable {
//		System.setProperty("webdriver.edge.driver","C:\\Users\\VAISHNAVI\\Downloads\\edgedriver_win64 (3)");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().parentFrame();
		String text = driver.findElement(By.xpath("//b[@id='topic']")).getText();
		System.out.print(text);
		driver.switchTo().defaultContent();
		String text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text1);
	}

}
