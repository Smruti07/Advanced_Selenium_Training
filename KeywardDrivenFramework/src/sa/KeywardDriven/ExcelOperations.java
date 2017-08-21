package sa.KeywardDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	static XSSFWorkbook workbook;
	//static FileOutputStream fos;
	static XSSFSheet sheet;
	
	public static void openExcelForReading(String filePath) throws InvalidFormatException, IOException
	{
		workbook=new XSSFWorkbook(new File(filePath));
	}
	

    public static String read(int rowNum, int cellNum)
	{
    	String cellValue=workbook.getSheetAt(0).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return cellValue;
	}
    
    public static Object[][] readAll()
    {
/*    	Object[][] data = null;
		for(int rowNum=0; rowNum<=sheet.getLastRowNum(); rowNum++)
		{
			Row row= sheet.getRow(rowNum);
			for(int cellNum=0; cellNum<row.getLastCellNum(); cellNum++)
			{
				Cell cell= row.getCell(cellNum);
				data= new Object[row.getRowNum()][cell.getColumnIndex()];
				data[row.getRowNum()][cell.getColumnIndex()]=cell.getStringCellValue();
			}
		}*/
    	Object[][] data = new Object[3][2];
    	for(Row row: sheet)
    		for(Cell cell: row)
    			data[row.getRowNum()][cell.getColumnIndex()]=cell.getStringCellValue();
		return data;

    }
    
    public static void closeWorkbook() throws IOException
    {
    	workbook.close();
    }
    
    public static void loadSheet(int sheetNum)
    {
    	sheet= workbook.getSheetAt(sheetNum);
    }
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		openExcelForReading("D:\\Test.xlsx");
		loadSheet(0);
		//openFileForWriting("");
		//write(0,0,"My Text");
		System.out.print(read(0,0));
		closeWorkbook();
	}

}