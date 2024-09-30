import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignemtnframes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//frames problem
//		driver.get("https://the-internet.herokuapp.com/nested_frames");
//        driver.switchTo().frame("frame-top");
//        driver.switchTo().frame("frame-middle");
//        System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name ="Ritu Pandey";
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
	}

}
