import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.findElements(By.linkText("iframe")).size();
		driver.switchTo().frame("frame1");
		WebElement childFrame = driver.findElement(By.tagName("iframe")); 
        driver.switchTo().frame(childFrame);
        String childFrameText = driver.findElement(By.tagName("p")).getText();
        System.out.println("Text inside child frame: " + childFrameText);

	}

}
