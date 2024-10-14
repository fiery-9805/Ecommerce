import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletePractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
        WebElement inputField = driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']//input"));
        inputField.sendKeys("Blue");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='auto-complete__option auto-complete__option--is-focused css-1n7v3ny-option' and text()='Blue']")));

        suggestion.click();
        
        WebElement inputField2 = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']//input"));
        
        inputField2.sendKeys("Black");
        
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement suggestion1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='auto-complete__option auto-complete__option--is-focused css-1n7v3ny-option' and text()='Black']")));

        suggestion1.click();
        
         
	}

}
