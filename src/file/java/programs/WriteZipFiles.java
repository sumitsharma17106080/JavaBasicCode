package file.java.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class WriteZipFiles {

	public static void main(String[] args) {
		try {
			ZipOutputStream zos=new ZipOutputStream(new FileOutputStream("Com.zip"));
			File file1=new File("abc.txt");
			ZipEntry zipEntry=new ZipEntry("abc.txt");
			zos.putNextEntry(zipEntry);
			FileInputStream fis=new FileInputStream(file1);
			byte[] bytes=new byte[1024];
			int length;int count=0;
			while((length=fis.read(bytes))>=0) {
				zos.write(bytes, 0, length);
				System.out.println(++count);
			}
			zos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
