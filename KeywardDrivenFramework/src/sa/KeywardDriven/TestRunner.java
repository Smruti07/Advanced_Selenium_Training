package sa.KeywardDriven;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestRunner {

	@Test
	void test() throws InvalidFormatException, IOException
	{
		ExcelOperations.openExcelForReading("D:\\KeywardDriven.xlsx");
		ExcelOperations.loadSheet(0);
		Action.initDriver();
		for(int rowNum=0; rowNum<5; rowNum++)
		{
			if(ExcelOperations.sheet.getRow(rowNum).getCell(2).getStringCellValue().equalsIgnoreCase("EnterText"))
			{
				Action.EnterText(ExcelOperations.sheet.getRow(rowNum).getCell(0).getStringCellValue()
						,ExcelOperations.sheet.getRow(rowNum).getCell(1).getStringCellValue(),
						ExcelOperations.sheet.getRow(rowNum).getCell(3).getStringCellValue()+Keys.TAB);
			}
			if(ExcelOperations.sheet.getRow(rowNum).getCell(2).getStringCellValue().equalsIgnoreCase("Click"))
			{
				Action.Click(ExcelOperations.sheet.getRow(rowNum).getCell(0).getStringCellValue(),
						ExcelOperations.sheet.getRow(rowNum).getCell(1).getStringCellValue());
			}
			if(ExcelOperations.sheet.getRow(rowNum).getCell(2).getStringCellValue().equalsIgnoreCase("Select"))
			{
				Action.Select(ExcelOperations.sheet.getRow(rowNum).getCell(0).getStringCellValue(),
						ExcelOperations.sheet.getRow(rowNum).getCell(1).getStringCellValue(),
						ExcelOperations.sheet.getRow(rowNum).getCell(3).getStringCellValue());
			}
		}
	}
}
