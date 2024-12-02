package UtilJava;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilClass {

	
	public  static void getDataFromExcel() throws IOException
	
	{
		
		FileInputStream file=new FileInputStream("C://Practice Java_selenium//TestData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int rowCnt=sheet.getPhysicalNumberOfRows();
		System.out.println("row count"+rowCnt);
		XSSFRow row =sheet.getRow(0);
		int colCnt=row.getLastCellNum();
		System.out.println("row count"+colCnt);
		Object[][] data=new Object[rowCnt-1][colCnt];
		
		for(int i=0;i<=rowCnt-1;i++)
		{
			//sheet.getRow(i+1);
			 
			for(int j=0;j<=colCnt;j++)
			{
				System.out.println(row.getCell(j));
			}
	
		}
		
		
	}
}
