package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ClientCare_Excel_Utility {
	/**
	 * used to get row size of the sheet
	 * @param sheetname
	 * @return
	 * @throws Exception
	 */
	
	public int getRowSize(String sheetname) throws Exception
	{
		FileInputStream fis=new FileInputStream("./CRONOS.ClientCare.CRMProject/src/test/resources/ClientCareProject.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		int rowsize=sheet.getLastRowNum();
		workbook.close();
		return rowsize;
	}
	/**
	 * Used to get the data from Excel
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream("./CRONOS.ClientCare.CRMProject/src/test/resources/ClientCareProject.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		String data = sheet.getRow(rownum).getCell(cellnum).toString();
		workbook.close();
		return data;
	}
	/**
	 * Used to write data into Excel
	 * @param sheetname
	 * @return
	 * @throws Exception
	 */
	public void writeDataInExcel(String sheetname,int rownum,int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream("./CRONOS.ClientCare.CRMProject/src/test/resources/ClientCareProject.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		sheet.getRow(rownum).createCell(cellnum);
		
		FileOutputStream fos=new FileOutputStream("./CRONOS.ClientCare.CRMProject/src/test/resources/ClientCareProject.xlsx");
		workbook.write(fos);
		workbook.close();
		System.out.println("able to write on workbook ");
	}
}
