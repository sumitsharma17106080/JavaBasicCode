package conversion.java.program;


import java.util.Scanner;


public class ConversionBooleanToString {

	public static void main(String[] args) {
		boolean b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a true/ false =");
		b=sc.nextBoolean();
		
		//Approach 1 Using Wrapper Method
		String bStr=String.valueOf(b);
		System.out.println("Boolean String="+bStr);
	
		

	}

}
