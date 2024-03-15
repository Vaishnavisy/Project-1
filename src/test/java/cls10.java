import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cls10 {
	static WebDriver driver;
	public static void launch (String url) {
		WebDriverManager.edgedriver().setup();
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void fill (WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void click (WebElement element) {
		element.click();
	}
}
