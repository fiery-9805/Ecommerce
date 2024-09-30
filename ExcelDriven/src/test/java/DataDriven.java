import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public ArrayList<String> getData(String testcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		
        //fileInputStream argument
		FileInputStream fis = new FileInputStream("Downloads//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i =0 ;i <sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
			XSSFSheet sheet= workbook.getSheetAt(i);
			//identify test cases column scanning the entire row
			Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
			Row firstrow = rows.next();
			Iterator<Cell> cell = firstrow.cellIterator();//row is collection of cells
			int k =0;
			int column=0;
			while(cell.hasNext())
			{
				Cell value =cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
				{
					column=k;
				}
				k++;
			}
			System.out.println(column);
			
			//once column identified then scan entire test case column to identify purchase test  case
			
			while(rows.hasNext())
			{
				Row r = rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
				{
					//after i grab purchse test case data row = pull all the  data of the row and feed into test
					
					Iterator <Cell> cv = r.cellIterator();
					while(cv.hasNext())
					{
						a.add(cv.next().getStringCellValue());
				}
				
				}	

			}
			}
		}
		return a;
		
	}

	public static void main(String[] args) throws IOException {
		
		
	
		
		
	}

}
