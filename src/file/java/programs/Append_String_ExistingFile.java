package file.java.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class Append_String_ExistingFile {

	public static void main(String[] args) {
		File file=new File("xyz.txt");
		BufferedWriter bw=null;
		
		try {
			bw=new BufferedWriter(new FileWriter(file,true));
			bw.write("\nEnd...");
			bw.flush();
			bw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
