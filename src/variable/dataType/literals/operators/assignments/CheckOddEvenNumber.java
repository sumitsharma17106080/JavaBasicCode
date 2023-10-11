package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckOddEvenNumber {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number=");
		x=sc.nextInt();
		
		if(x%2==0)System.out.println(x +" is Even");
		else System.out.println(x +" is ODD");
	}

}
