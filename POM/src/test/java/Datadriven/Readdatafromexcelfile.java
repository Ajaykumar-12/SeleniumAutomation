package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatafromexcelfile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		
		XSSFSheet sheet=workbook.getSheet("Student");
		
		int totalRows=sheet.getLastRowNum();
		
		System.out.println("Total Rows are "+totalRows);
		
		int totalcols=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total cols are "+totalcols);
		
		for(int i=0;i<=totalRows;i++) {
			
			XSSFRow r=sheet.getRow(i);
			
			for(int j=0;j<totalcols;j++) {
				
				XSSFCell cel=r.getCell(j);
				
				System.out.printf("%-15s", cel);
			}
			System.out.println();
		}
	}
}
