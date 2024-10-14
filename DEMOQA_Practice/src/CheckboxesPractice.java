import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		System.out.println(driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected());
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected());
		driver.findElement(By.xpath("//button[@title='Expand all']")).click();
		
		
		
		
		

	}

}
