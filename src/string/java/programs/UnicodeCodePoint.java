package string.java.programs;

import java.util.Scanner;

public class UnicodeCodePoint {

	public static void main(String[] args) {
		String str;int index;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		System.out.print("Enter Index =");
		index=sc.nextInt();
		
		int uniCode=str.codePointAt(index);
		System.out.println(uniCode);

	}

}
