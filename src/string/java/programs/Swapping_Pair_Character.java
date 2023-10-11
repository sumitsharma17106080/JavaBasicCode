package string.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping_Pair_Character {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		String result="";
		//Approach 1 Brut Forcr
		char[] chArr=str.toCharArray();
		for(int i=0;i<chArr.length-1;i=i+2) 
			{
				char temp=chArr[i];
				chArr[i]=chArr[i+1];
				chArr[i+1]=temp;
					
				}
		result=new String(chArr);
	
		System.out.println("String ="+str);
		System.out.println("Sort String ="+result);
				
		//Approach Using StringBuffer append
		  result="";
		  StringBuffer sb=new StringBuffer();
		  for(int i=0;i<str.length()-1;i=i+2) {
			  sb.append(str.charAt(i+1));
			  sb.append(str.charAt(i));
				
				}
		  if(str.length()%2!=0) sb.append(str.charAt(str.length()-1));
		  result=new String(sb);
		  System.out.println("String ="+str);
		  System.out.println("Sort String ="+result);
	}

}
