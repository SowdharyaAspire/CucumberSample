package com.greens.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.store.Cur;

public class DataHelper {
	public static HashMap<String, String> storeValues = new HashMap<String, String>();

	public static List<HashMap<String, String>> readExcelDatafromFile(String filePath, String sheetName) {
		// create Java List to store Hashmaps
		List<HashMap<String, String>> excelData = new ArrayList<>();

		try {
			FileInputStream fs = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheet(sheetName);

			// catch header row, so that you can use it as Key for your hashmap
			Row HeaderRow = sheet.getRow(0);

			for (int r = 1; r <= sheet.getPhysicalNumberOfRows() - 1; r++) {
				Row CurrentRow = sheet.getRow(r);
				// each row of data is stored in new hashmap
				HashMap<String, String> currentRowMap = new HashMap<String, String>();
				for (int c = 0; c < CurrentRow.getPhysicalNumberOfCells(); c++) {
					Cell CurrentCell = CurrentRow.getCell(c);
					String df = new DataFormatter().formatCellValue(CurrentCell);
					System.out.print(HeaderRow.getCell(c).getStringCellValue());
					System.out.println(df + "\t");
					currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), df);
					// i.e hashmap<key, value> = <row(0)column(c), row(1)column(c)>

				}
				excelData.add(currentRowMap);
			}
			wb.close();
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return excelData;

	}

	public static void updateCellValue(String filePath, String sheetName, String columnName, String value) {
		List<HashMap<String, String>> excelData = new ArrayList<>();

		try {
			FileInputStream fs = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheet(sheetName);

			// catch header row, so that you can use it as Key for your hashmap
			Row HeaderRow = sheet.getRow(0);
			HashMap<String, String> currentRowMap = new HashMap<String, String>();
			
			for (int c = 0; c < HeaderRow.getPhysicalNumberOfCells(); c++) {
				Cell CurrentCell = HeaderRow.getCell(c);
				String df = new DataFormatter().formatCellValue(CurrentCell);
				if (df.equals("Order number")) {
					System.out.println(HeaderRow.getCell(c).getStringCellValue());
					System.out.println(CurrentCell.getStringCellValue());
					
					CurrentCell.setCellValue(value);
					
					System.out.println(HeaderRow.getCell(c).getStringCellValue());
					System.out.println(CurrentCell.getStringCellValue());
					currentRowMap.put(HeaderRow.getCell(c).getStringCellValue(), CurrentCell.getStringCellValue());
					// i.e hashmap<key, value> = <row(0)column(c), row(1)column(c)>
				} else {
				}
			}
			fs.close();
			FileOutputStream outputStream = new FileOutputStream("TestData.xls");
            wb.write(outputStream);
			wb.close();
			outputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
