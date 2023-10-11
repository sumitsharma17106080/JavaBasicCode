package conversion.java.program;

import java.util.Scanner;

public class ConversionBinaryToOctal {

	public static void main(String[] args) {
		
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Binary Number =");
		b=sc.next();
		//Approach  1 Using Wrapper Method
		int n=Integer.valueOf(b, 2);
		String octal=Integer.toOctalString(n);
		System.out.println("Binary ="+b);
		System.out.println("Decimal ="+n);
		System.out.println("Octal ="+octal);
		
		//Approach 2 Brut force;
		System.out.println("Approach 2 Brut force");
		int bin=Integer.parseInt(b);
		System.out.println(" Binary 2="+bin);
		int i=0;
		int deci=0;
		
		while(bin!=0) {
			deci+=Math.pow(2,i++)*bin%10;
			bin/=10;
		}
		System.out.println(" Decimal 2="+deci);
		int octal2=0; i=0;
		while(deci!=0) {
			
			octal2+=(deci%8)*(int)(Math.pow(10, i++));
			
			deci/=8;
			
		}
		
		
		System.out.println(" Octal 2 ="+octal2);
		
	}

}
