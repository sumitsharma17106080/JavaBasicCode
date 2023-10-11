package file.java.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class CopyFile1_File2 {

	public static void main(String[] args) {
		File file1=new File("abc.txt");
		File file2=new File("xyz.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String  str=br.readLine();
			BufferedWriter bw=new BufferedWriter(new FileWriter(file1));
			bw.write(str);
			bw.flush();
			
			BufferedReader br2=new BufferedReader(new FileReader(file1));
			BufferedWriter  bw2=new BufferedWriter(new FileWriter(file2));
			int n;
			while((n=br2.read())!=-1) {
				bw2.write((char)n);
			}
			bw2.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
