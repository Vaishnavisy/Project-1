import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

//GET, MANAGE, NAVIGATE, WINDOW TYPE(NEW WINDOW), GET TITLE, GET PAGESOURCE
public class cls1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.TAB);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if(url.equals(currentUrl)) {
			System.out.println("Matched");
		}
		else {
			System.err.println("Not Matched");
		}
		String title = driver.getTitle();
		System.out.println(title);
//		driver.close();
//		driver.quit();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		}

}
