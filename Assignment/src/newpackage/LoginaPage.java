package newpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginaPage {

	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.get("https://brotallion.com/account");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.name("customer[email]")).sendKeys("rituk0751@gmail.com");
			driver.findElement(By.id("CustomerPassword")).sendKeys("ritu@123PA");
			driver.findElement(By.id("login-sign-in-submit")).click();
		
			
	}

}
