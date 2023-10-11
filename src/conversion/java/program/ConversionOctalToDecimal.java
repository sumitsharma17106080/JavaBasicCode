package conversion.java.program;

import java.util.Scanner;

public class ConversionOctalToDecimal {

	public static void main(String[] args) {
		String octal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Octal Number =");
		octal=sc.next();
		//Approach 1 Wrapper Method
		int decimal=Integer.parseInt(octal,8);
		System.out.println("Octal ="+octal);
		System.out.println("Decimal ="+decimal);
		
		////Approach 2 Using Brut Force
		System.out.println("Approach 2 Using Brut Force");
		
		int octalI=Integer.parseInt(octal);
		System.out.println("Octal 2 ="+octalI);
		int decimal2=0;int i=0;
		while(octalI!=0) {
			decimal2+=(octalI%10)*Math.pow(8,i++);
			octalI/=10;
		}
		
		System.out.println("Decimal 2 ="+decimal2);
		

	}

}
