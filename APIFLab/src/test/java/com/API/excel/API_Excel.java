package com.API.excel;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

<<<<<<< HEAD:APIFLab/src/main/java/com/lab/readExcel/ExcelFilereader.java
public class ExcelFilereader {
//	static String cellv = null;
=======
public class API_Excel {
>>>>>>> 4ec5e0471f1b486f87e529fc81f36da9e9132c36:APIFLab/src/test/java/com/API/excel/API_Excel.java

	static String cdir = System.getProperty("user.dir");
	public static void main(String[] args) {
		System.out.println(cdir);
	}
	public static String readExcel(String SheetName, String cellNumber) {
		String cellValue = null;
		try {
			DataFormatter f = new DataFormatter();
			InputStream file = new FileInputStream(cdir + "\\src\\test\\resources\\Files\\Book1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(SheetName);
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

