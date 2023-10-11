package conversion.java.program;

import java.util.Scanner;

public class ConversionStringToLong {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Stirng(Number) =");
		str=sc.next();
		try {
		long l1=Long.parseLong(str);
		long l2=Long.valueOf(str);
		System.out.println("Long 1="+l1);
		System.out.println("Long 2="+l2);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

	}

}
