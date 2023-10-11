package conversion.java.program;

import java.util.Scanner;

public class ConversionHexadecimalToDecimal {

	public static void main(String[] args) {
		String hexaDecimal;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a HexaDecimal Number =");
		hexaDecimal=sc.next();
		
		//Approach 1 Using Wrapper Method
		int decimal=0;int k=0;
		for(int i=hexaDecimal.length()-1;i>=0;i--) {
			int t=Character.digit(hexaDecimal.charAt(i), 16);
			decimal+=t*Math.pow(16,k);
			k++;
			
		}
		System.out.println("Decimal ="+decimal);
		
		//Approach 2 Using Brut Force
		decimal=0;k=0;
		for(int i=hexaDecimal.length()-1;i>=0;i--) {
			char ch=hexaDecimal.charAt(i);
			if(ch>='0' && ch<='9') {
				decimal+=(int)(ch-48)*Math.pow(16,k);
			}
			else if(ch>='A' && ch<='F') {
				decimal+=(int)(ch-55)*Math.pow(16,k);
			}
			else if(ch>='a' && ch<='f') {
				decimal+=(int)(ch-87)*Math.pow(16,k);
			}
			k++;
		}
		System.out.println("decimal 2="+decimal);
	}

}
