import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class base1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

  
	String veggies[] = {"Cucumber","Brocolli","Beetroot"};
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	Thread.sleep(3000);
	addItems(driver,veggies); 
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	driver.findElement(By.cssSelector("span.promoInfo")).getText();
	
	
	}
	
	public static void addItems(WebDriver driver,	String veggies[]) {
		 int j =0;
	
List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0 ; i <products.size();i++) {
			//format to get actual name 
		String[] name = products.get(i).getText().split("-");
	    String formattedName =  name[0].trim();
		
		//check whether name extracted is present in array or not 
		//convert array into array list for easy search
	    List a1 = Arrays.asList(veggies);
	
		if(a1.contains(formattedName)) {
			j++; //  j is for count of loop
			//click on add to cart
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==3) {
				break;
			}
			
			
		}
			
		
	}
	}

}
