package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filewriterdemo12345 {

	public static void main(String[] args) throws IOException {
		String headers[]= {"Firstname","Mobilenumber","Place"};
		String data[][]= {{"Ajay","9573692931","Hyderabad"},{"Rajeswari","8978584747","Pune"},
				          {"Akshay","9541478535","Vijayawada"}};
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\File.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=book.getSheet("Sampledata");
		XSSFRow r=sheet.createRow(0);
		
		for(int i=0;i<headers.length;i++) {
			
			XSSFCell cel=r.createCell(i);
			cel.setCellValue(headers[i]);
		}
		for(int j=0;j<data.length;j++) {
			
			XSSFRow r1=sheet.createRow(j+1);
			for(int k=0;k<data.length;k++) {
				XSSFCell cl=r1.createCell(k);
				cl.setCellValue(data[j][k]);
			}
		}
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\File.xlsx");
	     book.write(fos);   
	     System.out.println("file created");
	}
}
