import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectchekboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();

	}

}
