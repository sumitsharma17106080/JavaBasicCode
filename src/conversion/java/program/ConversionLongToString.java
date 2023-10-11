package conversion.java.program;

import java.util.Scanner;

public class ConversionLongToString {

	public static void main(String[] args) {
		long l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a long (Number) =");
		l=sc.nextLong();
		try {
		String str1=Long.toString(l);
		String str2=String.valueOf(l);
		System.out.println("String 1="+str1);
		System.out.println("String 2="+str2);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}


	}

}
