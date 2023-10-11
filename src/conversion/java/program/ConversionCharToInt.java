package conversion.java.program;

import java.util.Scanner;

public class ConversionCharToInt {

	public static void main(String[] args) {
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.print(" Enter a Character=");
		ch=sc.next().charAt(0);
		
		int i=(int)ch;
		System.out.println(" Int 1="+i);
		i=ch+0;
		System.out.println(" Int 2="+i);
		i=Character.getNumericValue(ch);
		System.out.println(" Int 3="+i);
		i = Integer.parseInt(String.valueOf(ch));
		System.out.println(" Int 4="+i);

	}

}
