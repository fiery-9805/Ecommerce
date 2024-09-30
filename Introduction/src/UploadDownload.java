import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UploadDownload {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\\\Users\\\\rituk\\\\Downloads\\\\download.xlsx";
		String text = "Apple";
     WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
      driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
      //download 
      driver.findElement(By.cssSelector("#downloadButton")).click();
      
      //edit excel -get column number  of the price - get row number of apple -update excel with row ,col
        int col = getColumnNumber(fileName , "price");
        int row = getRowNumber(fileName,"Apple");
        updateCell(fileName,row,col,"599");
      
      //upload
      WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
      upload.sendKeys("C:\\Users\\rituk\\Downloads\\download.xlsx");
      
      //wait for success message to display
      By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2)");
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
      String toasttext = driver.findElement(toastLocator).getText();
      Assert.assertEquals("Updated Excel Data Successfully", toasttext);
      
      wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator)); 
      
      //verify updated excel data showing in the web table
      
      //div[text()='Apple']/parent::div/parent::div[@id='cell-4-undefined']
      String priceColumn = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
      String actualprice= driver.findElement(By.xpath("div[text()='Apple']/parent::div/parent::div[@id='cell-"+priceColumn+"-undefined']")).getText();
  
      
	}

	private static boolean updateCell(String fileName, int row, int col, String updatedValue) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet 1");	
		Row rowField = sheet.getRow(row-1);
		Cell cellField = rowField.getCell(col-1);
		cellField.setCellValue(updatedValue);
		FileOutputStream fos = new FileOutputStream(fileName);
		workbook.write(fos);
		workbook.close();
		fis.close();
		return true;
		
	}

	private static int getRowNumber(String fileName, String text) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet("Sheet 1");	
				Iterator<Row> rows = sheet.rowIterator();
				int k =1;
				int rowIndex = -1;
				while(rows.hasNext()) {
					Row row = rows.next();
					Iterator<Cell> cells = row.cellIterator();
					
					while(cells.hasNext()) {
						Cell cell = cells.next();
						
						if(cell.getStringCellValue().equalsIgnoreCase(text)) {
							rowIndex =k;
						}	
						
					}
					k++;		
					
					
				}
				return rowIndex;
	
	}

	private static int getColumnNumber(String fileName, String colName) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet("Sheet 1");	
				Iterator<Row> rows = sheet.rowIterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k =1;
				int column =0;
				while(ce.hasNext()) {
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase(colName))
					{
						column = k;
					}
					k++;
				}
				System.out.println(column);
				return column;
			}
		
	}


