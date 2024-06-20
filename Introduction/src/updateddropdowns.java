import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateddropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count the number of checkboxes
     System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i =1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
