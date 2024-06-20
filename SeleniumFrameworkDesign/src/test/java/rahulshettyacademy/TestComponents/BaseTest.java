package rahulshettyacademy.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobject.landingPage;

public class BaseTest {
	public WebDriver driver ;
	 public landingPage landingpa;
	
	public WebDriver initializeDriver() throws IOException

	{
		 Properties pro = new Properties();
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"C:\\Users\\rituk\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\rahulshettyacademy\\resources\\GlobalData.properties");
		 pro.load(fis);
		 String browserName = pro.getProperty("browser");
		 if(browserName.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
		 }else if (browserName.equalsIgnoreCase("firefox")) {
			 
		 }
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 return driver;
	}
	public String getScreenshot(String testCaseName) throws IOException{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") +"//reports" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}
	@BeforeMethod
	public landingPage launchApplication()throws IOException
	{
		driver = initializeDriver();
         landingpa = new landingPage(driver);
		landingpa.goTo();
		return landingpa;
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
