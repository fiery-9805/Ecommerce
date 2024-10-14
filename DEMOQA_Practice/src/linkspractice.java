import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class linkspractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

		for(int i = 1;i<links.size();i++) {
		      WebElement link = links.get(i);
		      System.out.println(link);
			
		      try {
	          
	                if (link.isDisplayed() && link.isEnabled()) {
	                    System.out.println("Opening link: " + link.getText());
	                    String openInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
	                    link.sendKeys(openInNewTab);
	                    Thread.sleep(2000);
	                } else {
	                    System.out.println("The link '" + link.getText() + "' is not clickable.");
	                }
	            } catch (Exception e) {
	                System.out.println("Exception while opening link '" + link.getText() + "': " + e.getMessage());
	            }
	        }

	}

}
