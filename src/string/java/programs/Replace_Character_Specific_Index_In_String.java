package string.java.programs;

import java.util.Scanner;

public class Replace_Character_Specific_Index_In_String {

	public static void main(String[] args) {
		String str; int index; char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		System.out.print("Enter Index =");
		index=sc.nextInt();
		System.out.print("Enter Char =");
		ch=sc.next().charAt(0);
		String result="";
		//Approach 1 Using subString() method
		result=str.substring(0,index)+ch+str.substring(index+1);
		System.out.println("String ="+str);
		System.out.println("Result String ="+result);
		
		//Approach 2 using StringBuilder setCharAt() method
		StringBuilder sb=new StringBuilder(str);
		sb.setCharAt(index, ch);
		result=new String(sb);
		System.out.println("String ="+str);
		System.out.println("Result String ="+result);
		
		//Approach 3 using StringBuilder setCharAt() method
		StringBuffer sbf=new StringBuffer(str);
		sbf.setCharAt(index, ch);
		result=new String(sbf);
		System.out.println("String ="+str);
		System.out.println("Result String ="+result);
		
		//Approach 4 Using Brut Force
		char temp=str.charAt(index);
		result=str;
		result.replace(temp, ch);
		System.out.println("String ="+str);
		System.out.println("Result String ="+result);
		
		
		
		
		
	}

}
