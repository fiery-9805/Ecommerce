import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.findElement(By.xpath("//*[text()='This text has random Id']"));
		driver.findElement(By.id("enableAfter"));
		driver.findElement(By.xpath("//button[@id='colorChange']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		By button = By.xpath("//button[@id='visibleAfter']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(button));
	

	}

}
