package testpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITESTLISTENERS interface implements TESTNG listeners

public class Listeners implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I successfully executed listeners pass code");
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I failed executed listeners pass code"+result.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
