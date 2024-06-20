package testpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basics {
     @Parameters({"URL"})
	@Test
	public void Demo(String urlname) {
		
		System.out.println("hello World");
		System.out.println(urlname); 
		
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Test");
	}
	
	@BeforeTest
	public void prerequiste() {
		System.out.println("My name is Ritu");
	}
	
	@AfterTest
	public void lastexecution() {
		System.out.println("I will come at last of all");
	}
	
	@AfterSuite 
	public void AfSuite () {
		System.out.println("I am the after suite");
	}

}
