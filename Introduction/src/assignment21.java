import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment21 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement multiSelectElement = driver.findElement(By.xpath("//input[@class='comboTreeInputBox']"));
		multiSelectElement.click();
		

		WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/ul/li[1]/span"));
		WebElement checkbox2=  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/ul/li[2]/span[2]"));
		WebElement checkbox3=  driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[2]/ul/li[6]/ul/li[1]/span/input"));
		
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}
		if(!checkbox2.isSelected()) {
			checkbox2.click();
		}
		if(!checkbox3.isSelected()) {
			checkbox3.click();
		}
	
		if(checkbox1.isSelected()) {
			System.out.println(checkbox1.getText());
		}
		if(checkbox2.isSelected()) {
			System.out.println(checkbox2.getText());
		}
		if(checkbox3.isSelected()) {
			System.out.println(checkbox3.getText());
		}
	}

}
