package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
       

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\rituk\\OneDrive\\Documentos");
		WebDriverWait wait = new WebDriverWait(driver,null);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn"))).click();;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles"))).click();
		
		File f = new File("Downloads\\convert.zip");
		if(f.exists())
		{
			System.out.println("File Found");
		}
		
		
		
		
		
		
		
		
	}

}
