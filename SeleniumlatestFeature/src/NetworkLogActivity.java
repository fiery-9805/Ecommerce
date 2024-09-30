import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.network.model.Response;
import org.openqa.selenium.devtools.v126.network.Network;

public class NetworkLogActivity {

	public static void main(String[] args) {
      
		ChromeDriver driver = new ChromeDriver();	
		
		//log file-> 
		
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		//Event will get fired
		devTools.addListener(Network.responseReceived(), response->
		{
		    org.openqa.selenium.devtools.v126.network.model.Response res = response.getResponse();
		    System.out.println(res.getUrl());
		    System.out.println(res.getStatus());
			
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library'])")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
