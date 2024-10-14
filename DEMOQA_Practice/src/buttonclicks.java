import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttonclicks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
	    WebElement clickbutton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	    Actions a = new Actions(driver);
	    a.doubleClick(clickbutton).perform();
		System.out.println(driver.findElement(By.xpath("//button[@id='doubleClickBtn']")).getText());

		
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		a.contextClick(rightclick).perform();
		System.out.println(driver.findElement(By.xpath("//button[@id='rightClickBtn']")).getText());
		

	}

}
