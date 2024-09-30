import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.util.function.Predicate;

public class BasicAuthentication {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//predicate - helps to create one filter condition for the data 
		
	     Predicate<URI> uriPredicate =  uri -> uri.getHost().contains("httpbin.org");
	     
	     ((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
		
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
