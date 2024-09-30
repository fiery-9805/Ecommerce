import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
       
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":"+ port + "/demo", "root", "ritu@123P");
		
		Statement  s = con.createStatement();
		ResultSet res= s.executeQuery("select * from credentials where scenario ='rewardscard';");
		
		res.next();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(res.getString("username"));
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(res.getString("password"));
	
		
		
		
		
		
		
		
		
	}

}
