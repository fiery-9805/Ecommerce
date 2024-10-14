import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FORMelements {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/text-box");
	  driver.findElement(By.id("userName")).sendKeys("Ritu Pandey");
	  driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("rtup13@gmail.com");
	  driver.findElement(By.id("currentAddress")).sendKeys("gorakhpur");
	  driver.findElement(By.id("permanentAddress")).sendKeys("gorakhpur");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
	  button.click();
	

	}

}
