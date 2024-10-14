import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.findElement(By.id("demo-tab-what"));
		driver.findElement(By.id("demo-tab-origin")).click();
		driver.findElement(By.id("demo-tab-use")).click();
	

	}

}
