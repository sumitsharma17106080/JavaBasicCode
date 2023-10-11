package string.java.programs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Convert_InputStream_to_String {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String :");
		String string=br.readLine();
		System.out.println("String :"+string);
		System.out.print("Enter int number :");
		int i=Integer.parseInt(br.readLine());
		System.out.println("Integer :"+i);
	}

}
