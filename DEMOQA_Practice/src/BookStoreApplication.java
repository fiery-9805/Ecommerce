import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BookStoreApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("riva12@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Riva12@123");
		driver.findElement(By.id("login")).click();
		
		

}
}
