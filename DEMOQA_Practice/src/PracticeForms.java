import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForms {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anusha");
		driver.findElement(By.id("lastName")).sendKeys("Dandekar");
		driver.findElement(By.id("userEmail")).sendKeys("a13@gmail.com");
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label"));
		radiobutton.click();
		driver.findElement(By.id("userNumber")).sendKeys("9660275935");
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000L);
		WebElement datepicker = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s = new Select(datepicker);
		s.selectByIndex(6);
		WebElement yearpicker = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1 = new Select(yearpicker);
		s1.selectByIndex(3);
		driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]")).click();
		
		  By subjectLocator = By.xpath("//div[@id='subjectsContainer']//input");
	      WebElement subjectTextBox = driver.findElement(subjectLocator);
	      subjectTextBox.sendKeys("English");
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'subjects-auto-complete__option')]"))).click();

		driver.findElement(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline'][2]")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\rituk\\Downloads");
		driver.findElement(By.id("currentAddress")).sendKeys("DAUDPUR EADST NEW SHIVPURI");
		
		WebElement stateInput = driver.findElement(By.id("react-select-3-input"));
        stateInput.sendKeys("Uttar Pradesh");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement suggestion = wait1.until(ExpectedConditions.visibilityOfElementLocated(
        	    By.xpath("//div[contains(@class, 'css-11unzgr')]//div[contains(@class, 'css-1n7v3ny-option') and text()='Uttar Pradesh']")));
        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", suggestion);
        	suggestion.click();
        	
        	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
	        WebElement stateInput1 = driver.findElement(By.id("react-select-4-input"));
	        stateInput1.sendKeys("Agra");
	        WebElement suggestion2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(
	        	    By.xpath("//div[contains(@class, 'css-11unzgr')]//div[contains(@class, 'css-1n7v3ny-option') and text()='Agra']")));
	        	((JavascriptExecutor) driver).executeScript("arguments[1].scrollIntoView(true);", suggestion2);
	        	suggestion2.click();
		
		driver.findElement(By.id("submit")).click();
		
		
		

	}

}
