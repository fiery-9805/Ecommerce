package newpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

	public static void main(String[] args) {
		String firstname = "Ritu";
		String lastname = "pandey";
		String email = "rituk0751@gmail.com";
	
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://brotallion.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector(".icon.icon-user")).click();
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("CreatePassword")).sendKeys("ritu@123PA");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
