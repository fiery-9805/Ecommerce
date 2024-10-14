import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuItemsPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/select-menu");	
        driver.findElement(By.xpath("//div[@class='css-1wa3eu0-placeholder']")).click();

        List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class, ' css-26l3qy-menu')]"));

        for (WebElement option : options) {
            String optionText = option.getText(); 
            
            if (optionText.equals("Group 1, option 1") || optionText.equals("Group 2, option 1")) {
                option.click(); 
            }
        }
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

