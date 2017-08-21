package sa.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationsRead {

	public static void main(String args[]) throws Exception, IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook(new File("D:\\Test.xlsx"));
		XSSFSheet sheet= workbook.getSheetAt(0);
		Row row= sheet.getRow(0);
		Cell cell= row.getCell(0);
		System.out.println(cell.getStringCellValue());
		workbook.close();
	}
}