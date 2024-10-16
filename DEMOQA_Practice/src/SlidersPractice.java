import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		 Actions actions = new Actions(driver);
	     actions.clickAndHold(slider).moveByOffset(50, 0).release().perform();

	}

}
