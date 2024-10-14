import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		WebElement month =driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s = new Select(month);
		s.selectByIndex(6);
		WebElement yearpicker = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1 = new Select(yearpicker);
		s1.selectByIndex(98);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='13' and contains(@aria-label, 'July 13')]")));
	     dateElement.click();
		
	
	}

}
