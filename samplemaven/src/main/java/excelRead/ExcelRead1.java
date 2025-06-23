package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a,int b) throws IOException   //a row index and b is cell index
	{
		f=new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);			//input class in java to get ROW
		XSSFCell c=r.getCell(b);		
		return c.getStringCellValue();
	}
	
	public static String getIntegerData(int a,int b) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y=(int) c.getNumericCellValue();	//type casting - converting one data type to another data type
		return String.valueOf(y);
	}
}
