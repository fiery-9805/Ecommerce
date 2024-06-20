package rahulshettyacademy.TestComponents;

import java.io.IOException;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import rahulshettyacademy.resources.ExtendReporterNG;

public class Listeners extends BaseTest implements IListeners{
	ExtentTest test;
	ExtentReports extent = ExtendReporterNG.getReportObject();
	
	public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS, "TEST PASSED");
	}
	
	public void onTestFailure(ITestResult result) throws IOException
	{
		test.fail(result.getThrowable());
		
		//Screenshot ,Attach to report
		String filePath = getScreenshot(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
			
		
	}
	@Override
	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
