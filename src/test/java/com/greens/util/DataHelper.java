package com.greens.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper {
	public static HashMap<String, String> storeValues = new HashMap<String, String>();

	public static Map<String, Map<String, String>> readExcelDatafromFile(String filePath, String sheetName) {
		// create Java List to store Hashmaps
		Map<String, Map<String, String>> completeSheetData = new HashMap<String, Map<String, String>>();

		try {
			FileInputStream fs = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet = wb.getSheet(sheetName);

			// catch header row, so that you can use it as Key for your Map
			Row HeaderRow = sheet.getRow(0);

			// store Head row into List and Pass as key to map
			List<String> columnHeader = new LinkedList<String>();
			Iterator<Cell> cellIterator = HeaderRow.cellIterator();
			while (cellIterator.hasNext()) {
				columnHeader.add(cellIterator.next().getStringCellValue());
			}

			int rowCount = sheet.getLastRowNum();
			int columnCount = HeaderRow.getLastCellNum();
			for (int i = 1; i <= rowCount; i++) {
				Map<String, String> singleRowData = new HashMap<String, String>();
				Row row1 = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					Cell cell2 = row1.getCell(j);
					String df = new DataFormatter().formatCellValue(cell2);
					singleRowData.put(columnHeader.get(j), df);
				}
				completeSheetData.put(String.valueOf(i), singleRowData);
			}
			System.out.println("Excel data as Map" + completeSheetData);
			wb.close();
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return completeSheetData;

	}

	public static void updateCellValue(String filePath, String sheetName, String columnName, String value){
		try {
			File fileUpdate = new File(filePath);
		Workbook workbookUpdate = new XSSFWorkbook(fileUpdate);
		Sheet sheetUpdate = workbookUpdate.getSheet("data");
		Row headRow = sheetUpdate.getRow(0);
		int cellCount = headRow.getLastCellNum();
		int updateCellIndex = 0;
		for (int c = 1; c < cellCount; c++) {
			String temp = headRow.getCell(c).getStringCellValue();
			if (temp.equalsIgnoreCase(columnName)) {
				updateCellIndex = c;
				break;
			} else {
				continue;
			}
		}
		Row valueRow = sheetUpdate.getRow(1);
		valueRow.getCell(updateCellIndex).setCellValue(value);
		FileOutputStream outputStream = new FileOutputStream("TestData.xlsx");
		workbookUpdate.write(outputStream);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
