package test_Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public XSSFRow row;
	public XSSFCell cl;
	
	
	
	@SuppressWarnings({ "deprecation", "static-access" })
	@Test
	public String excel(String str1, int i, int j) throws IOException
	{
		
		try {
			fis=new FileInputStream("D:\\course\\neew.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 wb=new XSSFWorkbook(fis);
		 sh=wb.getSheet(str1);
		 row=sh.getRow(i);
		 cl=row.getCell(j);
		  String value=null;
		switch (cl.getCellType())
		    {
		        case Cell.CELL_TYPE_STRING:    //field that represents string cell type
		            value = cl.getStringCellValue() + "\t\t\t";
		            System.out.print(value);
		            break;
		        case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type
		            value = (long)cl.getNumericCellValue()+"";
		            System.out.print(value);
		            break;
		            default:

		}
		return value;
		
		
		 
		 
		 
	}
}
