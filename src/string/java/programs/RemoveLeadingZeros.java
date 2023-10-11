package string.java.programs;

import java.util.Scanner;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		//0000000123456 =>123456
		String number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number(String) =");
		number=sc.nextLine();
		
		//Approach 1 Converted into number to remove leading zero
		int number2=Integer.valueOf(number);
		String result=String.valueOf(number2);
		System.out.println("Origin Number="+number);
		System.out.println("Modify Number="+result);
		
		//Approach 2 
		
		

	}

}
