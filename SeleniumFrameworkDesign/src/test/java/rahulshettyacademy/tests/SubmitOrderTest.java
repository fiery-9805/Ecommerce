package rahulshettyacademy.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobject.ProductCatalogue;
import rahulshettyacademy.pageobject.landingPage;

public class SubmitOrderTest extends BaseTest{

        @Test
        public void submitOrder() throws IOException ,InterruptedException
        {
		String productName = "ZARA COAT 3";
		landingPage landingpa = launchApplication();
		ProductCatalogue productCata = landingpa.loginApplication("rtup13@gmail.com", "ritu@123P");
		
		List<WebElement>products =productCata.getProductList();
		
		productCata.addProductToCart(productName);
	
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = cartproducts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase("Zara Coat 3"));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		Actions a = new Actions(driver);
		
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder = 'Select Country']")), "india").build().perform();
		
		
		
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item)])[2]")).click();
		
		driver.findElement(By.cssSelector(".action_submit")).click();
		
		String confirmmessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		
		
		
	}
	
	
	

}
