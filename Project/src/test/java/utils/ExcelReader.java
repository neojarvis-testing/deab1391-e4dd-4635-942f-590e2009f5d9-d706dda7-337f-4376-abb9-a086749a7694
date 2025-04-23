package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	/*
     * Method Name: readData
     * Author Name: Jindam Pragna
     * Description: This method reads data from an Excel sheet.
     * Return Type: String
     * Parameter List: String path, String sheet, int row, int cell
     */
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

	public static String[][] getExcelData(String path, String sheet) throws IOException {
	        FileInputStream file = new FileInputStream(path);
	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheets = workbook.getSheet(sheet);
 
	        int rowCount = sheets.getPhysicalNumberOfRows();
	        int colCount = sheets.getRow(0).getPhysicalNumberOfCells();
 
	        String[][] data = new String[rowCount - 1][colCount]; // Skip header row
 
	        for (int i = 1; i < rowCount; i++) { // Start from index 1 to skip headers
	            XSSFRow row = sheets.getRow(i);
	            for (int j = 0; j < colCount; j++) {
	                XSSFCell cell = (row != null) ? row.getCell(j) : null;
	                data[i - 1][j] = (cell != null) ? cell.toString() : ""; // Handle null row or cell
	            }
	        }
 
	        workbook.close();
	        return data;
	    }

}
