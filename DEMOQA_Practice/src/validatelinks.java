import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatelinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		List<WebElement>links = driver.findElements(By.tagName("a"));
	      System.out.println("Total links found: " + links.size());
		for(int i = 1; i <links.size();i++) {
			WebElement link = links.get(i);
			   String url = link.getAttribute("href");
			   System.out.println(url);
			   String openInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
               link.sendKeys(openInNewTab);
			  HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			  conn.setRequestMethod("HEAD");
			  conn.connect();
			  int responseCode = conn.getResponseCode();
			  System.out.println(responseCode);
			  if(responseCode>400) {
				  System.out.println("Thye links with the text "+link.getText()+"is broken"+responseCode);
			  }
			  
			
		}
	
	    
	    

	}

}
