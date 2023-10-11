package exceptions.errors.java.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class HandleExceptionHierarchies {

	public static void main(String[] args) {
		try {
			int x=10,y=1;
			int z=x/y;
			
			File f=new File("abc.txt");
			FileOutputStream fos=new FileOutputStream(f);
			
			String str=null;
			str.charAt(12);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
