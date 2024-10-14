import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");  // Scroll inside the frame content.
		Thread.sleep(3000);
        js.executeScript("window.scrollBy(100, 0);"); // Scroll right by 100 pixels.
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(0, 500);"); // Scroll down the main page.

	}

}
