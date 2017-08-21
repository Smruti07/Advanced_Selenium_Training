package sa.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationWrite {

	public static void main(String[] args) throws Exception {
		
		//FileInputStream is used to write the value to the object
		
		FileInputStream fis= new FileInputStream(new File("D:\\Test.xlsx"));
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		Sheet sheet= workbook.getSheetAt(0);
		Row row= sheet.getRow(0);
	    Cell cell=row.getCell(0);
	    cell= row.createCell(2);
	    cell.setCellValue("Edited Cell");
	    fis.close();
	    
	  //FileOutputStream is used to write the value to the excel sheet
	    
	    FileOutputStream fos= new FileOutputStream(new File("D:\\Test.xlsx"));
	    workbook.write(fos);
	    workbook.close();

	}

}
