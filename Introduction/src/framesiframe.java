import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesiframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions a = new Actions(driver);
		WebElement source =driver.findElement(By.id("column-a"));
		WebElement destination = driver.findElement(By.id("column-b"));
		a.dragAndDrop(source, destination).build().perform();
		
		
		//nested frames
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")));
		

	}

}
