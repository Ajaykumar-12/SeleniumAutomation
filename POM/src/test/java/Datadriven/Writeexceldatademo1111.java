package Datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexceldatademo1111 {

	public static void main(String[] args) throws IOException {
        String headers[]= {"Firstname","MobileNumber","Place","Course","Fee"};
        String data[][]= {{"Ajay","9573692931","Hyderabad","Automation Testing","20000"},{"Vijay","9981318631","Pune","Java","30000"},
                    	 {"Chandana","8457812356","Delhi","Dotnet","36000"}};
        XSSFWorkbook book=new XSSFWorkbook();
        XSSFSheet sheet=book.createSheet("Coursedata");
        XSSFRow r=sheet.createRow(0);
        for(int i=0;i<headers.length;i++) {
        	XSSFCell cl=r.createCell(i);
        	cl.setCellValue(headers[i]);
        }
        for(int j=0;j<data.length;j++) {
        	XSSFRow r1=sheet.createRow(j+1);
        	for(int k=0;k<data.length;k++) {
        		XSSFCell cel=r1.createCell(j);
            	cel.setCellValue(data[j][k]);
        	}
        }
        FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\File.xlsx");
        
        book.write(fos);
        
        System.out.println("file created");
	}
}
