import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		//driver.findElement(By.id("searchBox")).click();
	//	driver.findElement(By.id("searchBox")).sendKeys("Cierra");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("firstName")).sendKeys("Anushka");
	    driver.findElement(By.id("lastName")).sendKeys("Singh");
	    driver.findElement(By.id("userEmail")).sendKeys("rtup13@gmail.com");
	    driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
	    driver.findElement(By.id("salary")).sendKeys("23000");
	    driver.findElement(By.xpath("//input[@placeholder='Department']")).sendKeys("IT");
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	    driver.close();
	   
		

	}

}
