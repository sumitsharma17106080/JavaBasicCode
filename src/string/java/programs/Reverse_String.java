package string.java.programs;

import java.util.Scanner;
import java.util.List;
import java.util.Stack;


public class Reverse_String {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String =");
		str=sc.nextLine();
		
		String result="";
		//Approach 1 Brut force
		for(int i=str.length()-1;i>=0;i--) {
			result+=String.valueOf(str.charAt(i));
		}
		System.out.println("String ="+str);
		System.out.println("Reverse String ="+result);
		
		// Approach 2 Using StrigBuffer
		StringBuffer sbf=new StringBuffer(str);
		sbf.reverse();
		result=new String(sbf);
		
		System.out.println("String ="+str);
		System.out.println("Reverse String ="+result);
		
		// Approach 3 Using StrigBuilder
				StringBuilder sb=new StringBuilder(str);
				sb.reverse();
				result=new String(sb);
				
				System.out.println("String ="+str);
				System.out.println("Reverse String ="+result);
				
		// Approach Using Stack
				
		Stack<Character> stack=new Stack<>();
		for(Character ch: str.toCharArray()) {
			stack.push(ch);
		}
		result="";
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		System.out.println("String ="+str);
		System.out.println("Reverse String ="+result);
		
	}

}
