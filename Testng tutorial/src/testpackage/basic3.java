package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class basic3 {
	
	@Test(groups={"Smoke"} )
	public void WebLoginHomeloan()
	{
		//selennium
		System.out.println("webloginhome");
	}

	@Test(timeOut=4000) 
	public void MobileLoginHomeLoan()
	{
		//apium
		System.out.println("Mobileloginhome");
	}
@Test
	public void LoginAPIHomeLoan()
	{
		//rest api automation
		System.out.println("APIloginHome");
	}
	@Test(dataProvider ="getData")
	public void MobilesignoutcarLoan(String username , String password) {
		System.out.println("Mobile Signout");
		System.out.println("username");
		System.out.println("password");
	}
	
	@DataProvider
	public Object[][] getData() {
		//i st comb - username and password
		//2- username and password -no credit history
		//3 - fraudlent credit history
		 Object[][] data = new Object[3][2];
		 //1 row
		 data[0][0]="firstsetusername";
		 data[0][1]="password"; // columns in the row are values for particular comb
		 
		 //2 set
		 data[1][0] = "secondsetusername";
		 data[1][1] = "passoword2";
		 
		 //3 set
		 data[2][0] = "thirdsetusername";
		 data[2][1] = "password3";
		 return data;
		 
		
	}
}
