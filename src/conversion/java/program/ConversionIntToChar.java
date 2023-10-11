package conversion.java.program;

import java.util.Scanner;

public class ConversionIntToChar {

	public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a int (Number) =");
		l=sc.nextInt();
		
		char ch=(char)l;
		System.out.println("Char ="+ch);
		ch=Character.forDigit(l,10);
		System.out.println("Char 2="+ch);
		
		ch=Character.forDigit(l, 16);
		System.out.println("Char 3="+ch);

	}

}
