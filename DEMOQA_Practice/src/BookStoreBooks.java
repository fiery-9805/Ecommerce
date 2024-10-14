import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStoreBooks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/books");
		driver.findElement(By.id("searchBox")).sendKeys("Git Pocket Guide");
		

	}

}
