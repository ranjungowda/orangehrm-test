package auto_handle_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDatatoExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);		
       wb.getSheet("create customer").getRow(1).getCell(1).setCellValue("fail");
       FileOutputStream fos = new FileOutputStream("./data/TestScript.xlsx");
       wb.write(fos);

	}

}
