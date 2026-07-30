package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class zippingdemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Exceldata.xlsx");
		
		FileOutputStream fos =new FileOutputStream("C:\\Users\\hp\\Desktop\\File2.xlsx");
		
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		
		int data;
		while((data=fis.read())!=-1) {
			
			dos.write(data);
		}
		fis.close();
		dos.close();
	}
}
