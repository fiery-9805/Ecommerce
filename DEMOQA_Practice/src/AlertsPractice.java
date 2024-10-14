import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		 Alert promptAlert = driver.switchTo().alert();
	     promptAlert.sendKeys("Hello, this is my input text!");
	     promptAlert.accept();

	}

}
