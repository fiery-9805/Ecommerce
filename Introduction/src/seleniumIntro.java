import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class seleniumIntro {

	public static void main(String[] args) {
		//invoking browser
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		 

	}

}
