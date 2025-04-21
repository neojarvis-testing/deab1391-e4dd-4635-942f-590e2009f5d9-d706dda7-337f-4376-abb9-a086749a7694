package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static String readData(String path, String sheet, int row, int cell) throws Exception {
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheets = workbook.getSheet(sheet);
		XSSFRow rows = sheets.getRow(row);
		XSSFCell cols = rows.getCell(cell);
		String value = cols.toString();
		workbook.close();
		return value;
	}

}
