package com.lab.readExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFilereader {
//	static String cellv = null;

	static String cdir = System.getProperty("user.dir");
	
	
	public static void main(String[] args) throws IOException {
		
		readToExcel("newpage1","A1");
		
	}

	public static String readToExcel(String SheetName, String cellNumber) {
		String cellValue = null;
		try {
			DataFormatter f = new DataFormatter();
			InputStream file = new FileInputStream(cdir + "\\src\\test\\resources\\ExelData\\Book1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			CellAddress cellRefe = new CellAddress(cellNumber);
			Row row = sheet.getRow(cellRefe.getRow());
			Cell cell = row.getCell(cellRefe.getColumn());
			cellValue = f.formatCellValue(cell);
			System.out.println(cellValue);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return cellValue;
	}

}