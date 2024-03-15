import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//GET TEXT,GET ATTRIBUTE, IS DISPLAYED, IS ENABLED, IS SELECTED
public class cls3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VAISHNAVI\\eclipse-workspace\\sel\\JanBatch\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		String url = "https://www.facebook.com/";
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cvaishnavisy25");
//		WebElement log = driver.findElement(By.xpath("//button[text()=]'Log in')"));
//		log.click();
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Vaishu");
		String text = element.getText();
		System.out.println(text);
		
		WebElement element1 = driver.findElement(By.id("pass"));
		element.sendKeys("Keerthi");
		String text1 = element.getAttribute("value");
		System.out.println(text1);
		
		WebElement element5 = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		element5.click();
		
//		WebElement element2 = driver.findElement(By.className("\"_6ltj\""));
//		element2.click();
		
//		WebElement element3 = driver.findElement(By.name("first name"));
//		element3.sendKeys("Vaishu");
		
//		WebElement element4 = driver.findElement(By.cssSelector(""));
//		element4.click();
			
		boolean displayed = driver.findElement(By.xpath("//input[@name=\"email\"]")).isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		System.out.println(enabled);
		
		boolean selected = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).isSelected();
		System.out.println(selected);
		
	}

}
