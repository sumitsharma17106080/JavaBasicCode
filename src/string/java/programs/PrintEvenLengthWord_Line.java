package string.java.programs;

import java.util.Scanner;

public class PrintEvenLengthWord_Line {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		
		//Approach 1 using split mehtod
		String [] strArr=str.split(" ");
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].length()%2==0) System.out.println(strArr[i]);
		}

	}

}
