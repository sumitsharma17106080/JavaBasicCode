package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckCharVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc =new Scanner(System.in);
		System.out.print("ch=");
		ch=sc.next("[a-zA-Z]").charAt(0);
		//Approach 1 using if Else
		if(ch!='a' && ch!='A' &&ch!='e' &&ch!='E' && ch!='i'&& ch!='I' && ch!='o' &&ch!='O' && ch!='u' && ch!='U' ) {
			System.out.println(ch +" is Consonant");
		}
		else System.out.println(ch +" is Vowel");
		
		//Approach 2 Using String indexOf method
		String str="aeiouAEIOU";
		if(str.indexOf(ch)!=-1) System.out.println(ch+" is Vowel");
		else  System.out.println(ch +" is Consonant");
	}

}
