import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//ATTRIBUTE NAME, ATTRIBUTE VALUE
public class cls2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		String url = "https://www.facebook.com/";
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("cvaishnavisy");
//		WebElement pass = driver.findElement(By.name("pass"));
//		pass.sendKeys("7794855874");
		user.clear();
		user.sendKeys("cvaishnavisy25@gmail.com");
		
		String attribute = user.getAttribute("name");
		System.out.println(attribute);
		String attribute1 = user.getAttribute("value");
		System.out.println(attribute1);
		
		
//		WebElement log = driver.findElement(By.linkText("Forgotten password?"));
//		log.click();
//		WebElement log1 = driver.findElement(By.partialLinkText("Forgotten"));
//		log1.click();
//		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(int i=0; i<link.size();i++) {
			WebElement linktext = link.get(i);
			String text = linktext.getText();
			System.out.println(text);
		}
	}

}
