package com.API.excel;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class API_Excel {

	
	public static String readExcel(String cellNumber,String excel) {
		String cellValue = null;
		try {
			DataFormatter f = new DataFormatter();
			InputStream file = new FileInputStream(excel);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			CellAddress cellRefe = new CellAddress(cellNumber);
			Row row = sheet.getRow(cellRefe.getRow());
			Cell cell = row.getCell(cellRefe.getColumn());
			cellValue = f.formatCellValue(cell);
			workbook.close();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return cellValue;

	}

}

