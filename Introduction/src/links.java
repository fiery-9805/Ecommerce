import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//give me the count of the links on the page
	System.out.println(driver.findElements(By.tagName("a")).size());
	
		//give me the count of links on the footer section of page
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//links count of only first column
	WebElement columnDriver	= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
		//click on each link in the column and check if the page is opening
	for(int i =1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
		//click on ctrl buttton so that all links open in diff tabs
		String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
	} //opens all the tabs
	
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext()) //it.hasnext means if there is any window
		{
			driver.switchTo().window(it.next()); // iterator moves to its 0 index
			
			driver.getTitle();
		}
		
	}
		
		
		
		
		
		
		
		
	}


