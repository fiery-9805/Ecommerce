package newpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addProduct {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Actions a = new Actions(driver);
			  try {
				  
			driver.get("https://brotallion.com/account");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.name("customer[email]")).sendKeys("rituk0751@gmail.com");
			driver.findElement(By.id("CustomerPassword")).sendKeys("ritu@123PA");
			driver.findElement(By.id("login-sign-in-submit")).click();
			Thread.sleep(3000);
			 WebElement navItem = wait.until(ExpectedConditions.elementToBeClickable(By.id("site-nav-item--1")));
	            a.moveToElement(navItem).perform();
	            WebElement woobieHoodiesLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Woobie Hoodies")));
	            a.moveToElement(woobieHoodiesLink).click().perform();

	            WebElement productTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='grid-product__title']")));
	            a.moveToElement(productTitle).click().perform();

	            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("add")));
	            a.moveToElement(addToCartButton).click().perform();

	            WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.cart__checkout")));
	            a.moveToElement(checkoutButton).click().perform();

	            // Scroll down and fill in shipping and payment details
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollBy(0,500)");

	            driver.findElement(By.name("address1")).sendKeys("X Y Z Communication Sector 3 Rohini");
	            
	            a.moveToElement(driver.findElement(By.id("shipping-address1-option-0"))).click().build().perform();
	            Thread.sleep(3000);
	            a.moveToElement(driver.findElement(By.name("phone"))).sendKeys("9532215892").build().perform();
	            Thread.sleep(3000);

                js.executeScript("window.scrollBy(0,500)");
            
            WebElement cardNumber = wait.until(ExpectedConditions.elementToBeClickable(By.id("number")));
            cardNumber.sendKeys("5126522001910224");
            
             WebElement expiryDate = wait.until(ExpectedConditions.elementToBeClickable(By.id("expiry")));
            expiryDate.sendKeys("08 / 24");

            WebElement cvv = wait.until(ExpectedConditions.elementToBeClickable(By.id("verification_value")));
            cvv.sendKeys("369");
            
            js.executeScript("window.scrollBy(0,300)");

            WebElement payButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout-pay-button")));
            payButton.click();
          
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            driver.quit();
		        }  
            
            
	}

}
