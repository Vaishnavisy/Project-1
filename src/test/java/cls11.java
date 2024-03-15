import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class cls11 extends cls10 {
	
	public static void main (String[]args) throws Throwable {
		launch ("https://www.facebook.com/");
		maximize();
		WebElement user = driver.findElement(By.id("email"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		fill(user,"Vaishu");
		click(login);
		
	}

}
