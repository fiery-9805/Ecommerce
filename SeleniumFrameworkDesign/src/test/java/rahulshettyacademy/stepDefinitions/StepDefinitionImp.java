package rahulshettyacademy.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobject.ProductCatalogue;
import rahulshettyacademy.pageobject.landingPage;

public class StepDefinitionImp extends BaseTest {
	public landingPage landingPa;
	public ProductCatalogue productCata;
	
	
	
	@Given("I landed on Ecommerce Page")
    public void I_landed_on_Ecommerce_Page() throws IOException 
	{
		landingPa= launchApplication();
	}

	
	@Given("^Logged in with the username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username , String password)
	{
		productCata = landingpa.loginApplication(username ,password);
	}
	
	 @When ("^I add the product (.+) from the Cart$")
	 public void i_add_product_to_cart(String productName)
	 {
		 List<WebElement>products =productCata.getProductList();
			
			productCata.addProductToCart(productName);
	 }
	
	  @And  ("^Checkout (.+) and submit  the order$")
	public void checkout_and_submit_order()
	{
		  driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		  List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
			Boolean match = cartproducts.stream().anyMatch(cartproduct-> cartproduct.getText().equalsIgnoreCase("Zara Coat 3"));
			Assert.assertTrue(match);
			driver.findElement(By.cssSelector(".totalRow button")).click();
			
			Actions a = new Actions(driver);
			
			a.sendKeys(driver.findElement(By.cssSelector("[placeholder = 'Select Country']")), "india").build().perform();
			
			
			
			driver.findElement(By.xpath("(//button[contains(@class,'ta-item)])[2]")).click();
			
			driver.findElement(By.cssSelector(".action_submit")).click();
	}
	  
	  @Then ("{string} message is displayed on ConfirmationPage")
	  public void message_displayed_confirmation_page()
	  {
		  String confirmmessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
			Assert.assertTrue(confirmmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
			
	  }
	  
	  @Then("^\"([^\"]*)\" message is displayed$")
	  public void something_message_is_displayed(String strArg1) throws Throwable {
		  Assert.assertEquals(strArg1, landingpa.getErrorMessage());
		  driver.close();
	  }

	
	
	
	
	
	
	
	
}
