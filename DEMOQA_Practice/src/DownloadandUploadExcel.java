import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadandUploadExcel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.id("downloadButton")).click();
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\rituk\\Downloads");
		
	    System.out.println(driver.findElement(By.xpath("//p[@id='uploadedFilePath']")).getText());
	}

}
