package Datadriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexceldatademoselenium {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	       String headers[]= {"FirstName","LastName","Age"};
	       
	       String data[][]= {{"Hari","kiran","25"},{"Ajay","kumar","32"},{"Raji","Pamarthi","31"}};
	       
	       XSSFWorkbook workbook=new XSSFWorkbook();
	       XSSFSheet sheet=workbook.createSheet("Data");
	       XSSFRow r=sheet.createRow(0);
	       for(int i=0;i<headers.length;i++) {
	    	   
	    	   XSSFCell cel=r.createCell(i);
	    	   cel.setCellValue(headers[i]);
	       }
	       for(int j=0;j<data.length;j++) {
	    	   
	    	   XSSFRow row=sheet.createRow(j+1);
	    	   for(int k=0;k<data.length;k++) {
	    		   
	    		   XSSFCell c=row.createCell(k);
	    		   c.setCellValue(data[j][k]);
	    	   }
	       }
	       try(FileOutputStream fileout=new FileOutputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx")){
	    	   
	    	   workbook.write(fileout);
	    	   workbook.close();
	    	   System.out.println("File created successfully");
	    	   
	       }
	       catch(Exception ex) {
	    	   
	    	   ex.printStackTrace();
	    	   
	       }

	}

}
