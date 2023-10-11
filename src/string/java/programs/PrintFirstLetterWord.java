package string.java.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstLetterWord {

	public static void main(String[] args) {
		// Print First Letter of Word line
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		
		// Approach 1 Using split and charAt method
		String [] strArr=str.split(" ");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i].charAt(0));
		}
		//Approach 2 Using Brute force
		System.out.println("\nString="+str);
		System.out.print(String.valueOf(str.charAt(0)));
		for(int i=1;i<str.length();i++) {
			
			if(String.valueOf(str.charAt(i)).equals(" "))  System.out.print(String.valueOf(str.charAt(i+1)));
			
			}
		
		
		//Approach Using Regex
		System.out.println("\nUsing Regex=");
		Pattern p=Pattern.compile("\\b[a-zA-Z]");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.print(m.group());
		}
	}

}
