import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("ritu@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("ritu");
        driver.findElement(By.className("signInBtn")).click();  
//        driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("p.error")).getText();   
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ritu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("r432");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	//	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("r432");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ritu@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("6587687678");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("form p")).getText();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.xpath("input[type*='pass'")).sendKeys("rahulsheetyacademy");
		driver.findElement(By.id("chckbonOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
	}

}
