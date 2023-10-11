package string.java.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Splitting_into_number_of_sub_strings {

	public static void main(String[] args) {
		String str1;String str2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String1 =");
		str1=sc.nextLine();
		
		ArrayList<String> al=new ArrayList<>();
		
		for(int i=0; i<str1.length();i++) {
			for(int j=i+1;j<=str1.length();j++) {
				al.add(str1.substring(i,j));
			}
		}
		int count=1;
		for(String s:al) {
			System.out.println(count++ +"="+s);
		}
	}

}
