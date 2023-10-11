package string.java.programs;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str1;String str2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1 =");
		str1=sc.nextLine();
		System.out.print("Enter String1 =");
		str2=sc.nextLine();
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.equals(str2));
		int n=compare(str1,str2);
		System.out.println(n);
	}

	private static int compare(String str1, String str2) {
		int lMin=Math.min(str1.length(), str2.length());
		
		for(int i=0;i<lMin;i++) {
			if(str1.charAt(i)!=str2.charAt(i)) return str1.charAt(i)-str2.charAt(i);
		}
		if(str1.length()!=str2.length()) return str1.length()-str2.length();
		return 0;
	}

}
