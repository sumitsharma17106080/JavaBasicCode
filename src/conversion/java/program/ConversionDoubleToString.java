package conversion.java.program;

import java.util.Scanner;

public class ConversionDoubleToString {

	public static void main(String[] args) {
		double d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a double(Number) =");
		d=sc.nextDouble();
		try {
		String str1=new Double(d).toString();
		String str2=Double.toString(d);
		String str3=String.valueOf(d);
		System.out.println("String1 ="+str1);
		System.out.println("String2 ="+str2);
		System.out.println("String3 ="+str3);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

	}

}
