package string.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_String {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		String result="";
		//Approach 1 Using array + swap
		char[] chArr=str.toCharArray();
		for(int i=0;i<chArr.length;i++) {
			for(int j=i+1;j<chArr.length;j++) {
				if(chArr[i]>chArr[j]) {
					char temp=chArr[i];
					chArr[i]=chArr[j];
					chArr[j]=temp;
				}
			}
		}
		for(int k=0;k<chArr.length;k++) {
			result=result.concat(String.valueOf(chArr[k]));
		}
		System.out.println("Stirng = "+str);
		System.out.println("Result = "+result);
		
		//Approach 2  Using Arrays.sort
		System.out.println("Using Arrays.sort =>");
		char[] chArr2=str.toCharArray();
		Arrays.sort(chArr);
		result="";
		for(int k=0;k<chArr.length;k++) {
			result=result.concat(String.valueOf(chArr[k]));
		}
		System.out.println("Stirng = "+str);
		System.out.println("Result = "+result);
		
		
	}
}
