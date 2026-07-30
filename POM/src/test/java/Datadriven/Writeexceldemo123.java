package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexceldemo123 {
	
	public static void main(String[] args) throws IOException {
		
		String headers[]= {"Firstname","Age","Designation"};
		
		String data[][]= {{"Ajay","32","SoftwareEngineer"},{"Raji","31","ElectricalEEngineer"}};
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sampledata");
		XSSFRow r=sheet.createRow(0);
		
		for(int i=0;i<headers.length;i++) {
			
			XSSFCell cel=r.createCell(i);
			cel.setCellValue(headers[i]);
		}
		
		for(int j=0;j<data.length;j++) {
			
			XSSFRow r1=sheet.createRow(j+1);
			for(int k=0;k<=data.length;k++) {
				XSSFCell cel=r1.createCell(k);
				cel.setCellValue(data[j][k]);
			}
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\File.xlsx");
		workbook.write(fos);
		System.out.println("sheet created");
	}

}
