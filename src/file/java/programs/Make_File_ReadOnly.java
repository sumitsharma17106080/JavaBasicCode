package file.java.programs;

import java.io.File;
import java.io.IOException;

public class Make_File_ReadOnly {

	public static void main(String[] args) {
		File f=new File("abc.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.setReadOnly();
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		f.setWritable(true);
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
	}

}
