import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String veggies[] = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0 ; i <products.size();i++) {
			//format to get actual name 
		String[] name = products.get(i).getText().split("-");
	    String formattedName =  name[0].trim();
		
		//check whether name extracted is present in array or not 
		//convert array into array list for easy search
	    List a1 = Arrays.asList(veggies);
	    int j =0;
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
