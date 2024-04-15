package com.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	
	public static void excelRead() {
		
		try {
			File f = new File("/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis); // - to access the workbook
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);
			System.out.println(cell);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		excelRead();
	}
	
	
	
	

}
