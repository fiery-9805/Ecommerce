package rahulshettyacademy.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobject.ProductCatalogue;
import rahulshettyacademy.pageobject.landingPage;

public class ErrorValidations extends BaseTest {

    @Test
    public void submitOrder() throws IOException ,InterruptedException
    {
	String productName = "ZARA COAT 3";
    landingpa.loginApplication("rtup13@gmail.com", "ritu@123PA");
	Assert.assertEquals("Incorrect email or password", landingpa.getErrorMessage());;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
