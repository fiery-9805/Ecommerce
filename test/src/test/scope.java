package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//give me the count of the links on the page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//count of links on the page
	System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
