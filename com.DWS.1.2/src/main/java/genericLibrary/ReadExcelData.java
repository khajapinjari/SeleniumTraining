package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadExcelData {
	public static Object[][] loginData() throws EncryptedDocumentException, IOException {
		File file =new File("./src/test/resources/testData/dataprovide.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Login");
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[row-1][col];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();}
		}
		return data; 
		
}
}
