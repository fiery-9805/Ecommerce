package selenium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class googleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		 WebDriver driver = new RemoteWebDriver(new URI("http://192.168.1.11:4444").toURL(), caps);
		 driver.get("http://google.com");	 
		 driver.getTitle();
		 driver.findElement(By.name("q")).sendKeys("ritu");
		 driver.close();
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
