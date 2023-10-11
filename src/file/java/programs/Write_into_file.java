package file.java.programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Write_into_file {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		//Approach 1 Using java.nio.file.Files 
		Path path=Path.of("D:\\BasicJavaCode\\abc.txt");
		try {
			str=br.readLine();
			Files.writeString(path,str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Approach 2 Using FileWriter
		try {
		FileWriter fw=new FileWriter("abc.txt",true);
		str=br.readLine();
		fw.write(str);
		fw.flush();
		fw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Approach 3 Using BufferedWriter
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt",true));
			str=br.readLine();
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Approach 4 Using PrintWriter
		try {
			PrintWriter pw=new PrintWriter(new FileWriter("abc.txt",true));
			str=br.readLine();
			pw.write(str);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Approach 5 Using FileOutputStream
		try {
			FileOutputStream fos=new FileOutputStream(new File("abc.txt"),true);
			str=br.readLine();
			fos.write(str.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
