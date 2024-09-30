import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.fetch.Fetch;
import org.openqa.selenium.devtools.v126.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v126.network.model.ErrorReason;

public class NetworkFailedRequest {

	public static void main(String[] args) {
        
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		Optional<List<RequestPattern>> patterns = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), java.util.Optional.empty(), java.util.Optional.empty())));
		devTools.send(Fetch.enable(Optional.empty(), java.util.Optional.empty()));
		
		devTools.addListener(Fetch.requestPaused(), request ->
		{
			
			devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
			
		});
		
		
		
		
	}

}
