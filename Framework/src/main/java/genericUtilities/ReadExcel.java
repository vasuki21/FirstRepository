package genericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadExcel implements IAutoConstants
{
	@DataProvider(name="test")
	public Object[][] readingdata() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		File file= new File(EXCELPATH);
		Workbook w = WorkbookFactory.create(file);
		Sheet sheet = w.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();  //cell is always dependent on row 
		Object[][] data = new Object[rowcount][cellcount];
		for(int row=0;row<rowcount;row++)
		{
			Row actualrow = sheet.getRow(row);
			for(int cell=0;cell<cellcount;cell++)
			{
				data[row][cell]=actualrow.getCell(cell).toString();
			}
		}
		return data;
	}
}
