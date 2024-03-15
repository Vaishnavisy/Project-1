import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//JAVASCRIPTEXECUTOR

public class cls6 {
	public static void main (String[]args) throws Throwable {
//		System.setProperty("webdriver.edge.driver","C:\\Users\\VAISHNAVI\\Downloads\\edgedriver_win64 (3)");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement down = driver.findElement(By.xpath("//a[text()=\'Careers\']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','Vaishu')", user,password,login);
		j.executeScript("arguments[1].setAttribute('value','******')", user,password,login);
		j.executeScript("arguments[0].setAttribute('style','background:Blue;border:2px solid red')", user,password,login);
		
//		j.executeScript("arguments[1],setAttribute('style','background:Green')",user,password,login );
//		j.executeScript("arguments[2].click()",user,password,login);
		Object ele = j.executeScript("return arguments[0].getAttribute('value')", user,password,login );
		System.out.println(ele);
		j.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(2000);
		j.executeScript("arguments[0].scrollIntoView(false)", user);
	}



}
