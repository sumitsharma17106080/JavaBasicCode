package string.java.programs;

import java.util.Scanner;

public class InsertStringIntoAnotherString {

	public static void main(String[] args) {
		String str1;String str2;int index;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1 =");
		str1=sc.nextLine();
		System.out.print("Enter String2 =");
		str2=sc.nextLine();
		System.out.print("Enter Index =");
		index=sc.nextInt();
		String result="";
		// Approach 1 Using split
		result=str1.substring(0,index)+str2+str1.substring(index);
		System.out.println("String1 ="+str1);
		System.out.println("String2 ="+str2);
		System.out.println("Result ="+result);
		
		//Approach Using StringBuffer
		StringBuffer sb=new StringBuffer(str1);
		result=sb.insert(index+1,str2).toString();
		System.out.println("String1 ="+str1);
		System.out.println("String2 ="+str2);
		System.out.println("Result ="+result);
		
		

	}

}
