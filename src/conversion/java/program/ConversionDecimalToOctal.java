package conversion.java.program;

import java.util.Scanner;

public class ConversionDecimalToOctal {

	public static void main(String[] args) {
		int decimal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Decimal Number =");
		decimal=sc.nextInt();
		//Approach 1 Wrapper Method
	
		String octal=Integer.toOctalString(decimal);
		System.out.println("Octal ="+octal);
		System.out.println("Decimal ="+decimal);
		
		//Approach 2 Brut FOrce
		System.out.println("Approach 2 Brut FOrce");
		System.out.println(" Decimal 2 ="+decimal);
		int i=0;int octalI=0;
		while(decimal!=0) {
			octalI+=(decimal%8)*Math.pow(10, i++);
			decimal/=8;
		}
		System.out.println("Octal 2= "+octalI);
		
	}

}
