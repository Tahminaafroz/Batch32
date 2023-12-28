package apachi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExelData {
	
		
		FileInputStream fis;
		XSSFWorkbook wb; // Workbook object

		public void getExcelData(int rowIndex, int columnIndex) {
			// Excel location or path
			File file = new File("./Batch32Practice/src/main/resources/ReadExcel.xlsx");

			// Convert data to stream
			try {
				fis = new FileInputStream(file);
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			// Apache POI methods to read the excel
			// 1st step = read whole excel as a book = workbook
			try {
				wb = new XSSFWorkbook(fis);
			} catch (IOException e) {

				e.printStackTrace();
			}

			// Call my Sheet as worksheet & get my sheet by index or sheet name
			XSSFSheet sht = wb.getSheetAt(0);
			//XSSFSheet sht = wb.getSheet("Sheet1");

			// Find all rows
			int totalRow = sht.getPhysicalNumberOfRows();

			// Loop all the rows
			for (int i = 0; i < totalRow; i++) {

				if (i == rowIndex) {
					XSSFRow row = sht.getRow(i);
					// Total number of columns
					row.getLastCellNum();

					// start another loop for column
					for (int j = 0; j < totalRow; j++) {
						if (j == columnIndex) {
							XSSFCell cell = row.getCell(j);
								
							
							
						System.out.println(cell.getStringCellValue());						
						}}}}
			
		}
public static void main(String[] args) {
	ReadExelData obj =new ReadExelData();
	obj.getExcelData(0, 1);
	
		
		
}}	

	
	


