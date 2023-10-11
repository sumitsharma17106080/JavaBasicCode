package conversion.java.program;

import java.util.Scanner;

public class ConversionDecimalToHexaDecimal {

	public static void main(String[] args) {
		int decimal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Decimal Number =");
		decimal=sc.nextInt();
		
		//Approach 1 Using Wrapper Method
		String hexadecimal=Integer.toHexString(decimal);
		
		System.out.println("HexaDecimal ="+hexadecimal);
		
		//Approach 2 Using Brut Force
		
		int[] hexa=new int[100];
		int decimal2=decimal;
		int i=0;char ch;
		while(decimal2!=0) {
			hexa[i]=decimal2%16;
			decimal2/=16;
			i++;
		}
		hexadecimal="";
		for( int j=i-1;j>=0;j--) {
			if(hexa[j]>9) {
				ch=(char) (hexa[j]+55);
				hexadecimal+=ch;
			}
			else hexadecimal+=hexa[j];
			
		}
		System.out.println("HexaDecimal 2 =>"+hexadecimal);
		
	}

}
