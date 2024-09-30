import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.fetch.Fetch;

public class NetworkMocking {

	public static void main(String[] args) {
      
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request->
		{
			if(request.getRequest().getUrl().contains("shetty"))
				{
				
				  String newMockUrl = request.getRequest().getUrl().replace("=shetty","=BadGuy");
				  System.out.println(newMockUrl);
				  devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newMockUrl), Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(), java.util.Optional.empty()));
				  
				};
		});
		
	    driver.get("https://rahulshettyacademy.com/angularAppdemo/");
	    driver.findElement(By.cssSelector("button[routerlink*='library'])")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		
		
	}

}
