package com.testngprogect;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {
	public static void main(String[] args) throws IOException {
	
		
		
	FileInputStream FIS = new FileInputStream("C:\\Users\\gaurav.sharma1\\Desktop\\TestData.xlsx");
	XSSFWorkbook workbook  = new XSSFWorkbook(FIS);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(0);
 
	 int Rownum  =  sheet.getLastRowNum()+1; 
	 
	 System.out.println(Rownum);
     int Colnum = row.getLastCellNum(); 
     System.out.println(Colnum);
     

	for(int i = 1;i<Rownum;i++)
	{
	row =   sheet.getRow(i);
	
    for(int j = 0;j<Colnum; j++){
    	System.out.println(row.getCell(j).getStringCellValue());
    } 
	}
	

    workbook.close(); 
	System.out.println();

	
}
	

	
	}