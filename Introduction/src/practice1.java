import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
//     	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header' and @data-v-7b563373 and @data-v-0af708be]")));
//           element.click();
		
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header' and @data-v-7b563373 and @data-v-0af708be]")).click();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
