package testpackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class basic2 {
	
	@Test
	public void WebLoginCarloan()
	{
		//selennium
		System.out.println("weblogincar");
	}

	@Test(enabled=false)
	public void MobileLoginCarLoan()
	{
		//apium
		System.out.println("Mobilelogincar");
	}
	@BeforeSuite
	public void Bsuite()
	{
		System.out.println("i am ritu pandey ..super girl");
	}
	@Test(dependsOnMethods= {"WebLoginCarloan"})
	public void LoginAPIcarLoan()
	{
		//rest api automation
		System.out.println("APIlogincar");
	}
}
 