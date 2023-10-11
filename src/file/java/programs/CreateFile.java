package file.java.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		File f=new File("xyz.txt");
		f.createNewFile();
		
		FileOutputStream fos=new FileOutputStream("pqr.txt");
		System.out.println("File Exist :"+f.exists());
		
		
	}

}
