package sa.excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationReadAll {

	public static void main(String args[]) throws Exception, IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook(new File("D:\\Test.xlsx"));
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		//Reading all cell values using for each loop

		for(Row row:sheet)
			for(Cell cell : row)
				System.out.println(cell.getStringCellValue());

		//Reading all cell values using for loop
		
		for(int rowNum=0; rowNum<=sheet.getLastRowNum(); rowNum++)
		{
			Row row= sheet.getRow(rowNum);
			int a=sheet.getLastRowNum();
			int b=row.getLastCellNum();
			for(int cellNum=0; cellNum<row.getLastCellNum(); cellNum++)
			{
				Cell cell= row.getCell(cellNum);				
				System.out.println(cell.getStringCellValue());
					 	
			}
		}

		workbook.close();
	}
}