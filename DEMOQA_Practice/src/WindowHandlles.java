import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
	    Set<String> window = driver.getWindowHandles();
	    Iterator<String> it = window.iterator();
	    String parentwindow= it.next();
	    String childwindow1 = it.next();
	    driver.switchTo().window(childwindow1);
	    System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
	    
	   driver.switchTo().window(parentwindow);
	   
	   driver.findElement(By.id("messageWindowButton")).click();
	   Set<String> windowHandles = driver.getWindowHandles();
	   it = windowHandles.iterator();

       // Iterate to find the second child window handle.
       String childWindow2 = null;
       while (it.hasNext()) {
           String handle = it.next();
           if (!handle.equals(parentwindow) && !handle.equals(childwindow1)) {
               childWindow2 = handle;
               driver.switchTo().window(childWindow2);
               WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
               WebElement bodyElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

               String text = bodyElement.getText();
               System.out.println("Text in the new window: " + text);
           }
       }


	
	   
	    
		

	}

}
