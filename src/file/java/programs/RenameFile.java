package file.java.programs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class RenameFile {

	public static void main(String[] args) {
		File f=new File("Sky.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Using renameTo method
		f.renameTo(new File("Root.txt"));
		
	

	}

}
