package conversion.java.program;

import java.util.Scanner;

public class ConversionStringToDouble {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Stirng(Number) =");
		str=sc.next();
		try {
		double d1=Double.valueOf(str);
		double d2=Double.parseDouble(str);
		System.out.println("Double1 ="+d1);
		System.out.println("Double2 ="+d2);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}
