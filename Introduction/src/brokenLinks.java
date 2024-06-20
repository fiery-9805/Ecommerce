import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		
		//get broken urls in the page
		 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href='brokenlink']")).getAttribute("href");
	List<WebElement>links =driver.findElements(By.cssSelector("li[class='gf-li']a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link :links) {
			link.getAttribute("href");
			
	
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			a.assertTrue(resCode<400);
			
			
		}
		
		
		
		
		
			
		
		
	}

}
