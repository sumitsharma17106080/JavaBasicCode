package string.java.programs;

import java.util.Scanner;

public class PangramString {
	private static boolean isLetter(char charAt) {
		if(!Character.isLetter(charAt)) return false;
		
		return true;
	}

	public static void main(String[] args) {
		// A String Which have all alphabet of English ignore case called pangram
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		//Approach 1 Using Brute Force
		str=str.toLowerCase();
		boolean[] bool=new boolean[26];
		
		for(int i=0;i<str.length();i++) {
			boolean check=isLetter(str.charAt(i));
			if(check) {
				int present=str.charAt(i)-'a';
				bool[present]=true;
			}
		}
		boolean finalCheck=true;
		for(int i=0;i<26;i++) {
			if(!bool[i]) {finalCheck=false;break;}
		}
		if(finalCheck) {
			System.out.println("yes "+ str+"  is apangram String");
		}
		else System.out.println("No "+ str+" is NOT pangram String");
		
		//Approach2 Using contains method of String
		
		char [] ch=new char[26];
		int k=97;
		for(int i=0;i<26;i++) ch[i]=(char) k++;
	
		str.toLowerCase();
		finalCheck=true;
		for(int i=0;i<ch.length;i++) {
			System.out.print(String.valueOf(ch[i])+"  ");
			if(!str.contains(String.valueOf(ch[i]))) {
				finalCheck=false;
				break;
			}
		}
		System.out.println();
		if(finalCheck) {
			System.out.println("yes "+ str+"  is apangram String");
		}
		else System.out.println("No "+ str+" is NOT pangram String");
	}

	
}
