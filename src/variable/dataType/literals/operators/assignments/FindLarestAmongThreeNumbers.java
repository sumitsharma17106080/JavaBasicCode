package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class FindLarestAmongThreeNumbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		System.out.print("c=");
		c=sc.nextInt();
		// Approach 1 using If / else 
		if(a>b) {
			if(a>c)System.out.println(a+" is larest");
			else System.out.println(c+" is larest");
		}
		else {
			if(b>c)System.out.println(b+" is larest");
			else System.out.println(c+" is larest");
		}
		// Approach 2 using Ternary Operator 1
		int k=((a>b)&&(a>c))?a:(b>c)?b:c;
		System.out.println(k +" is Larest");
		
		// Approach 2 using Ternary Operator 2
		int r=a>(b>c ?b:c)?a:(b>c?b:c);
		System.out.println(r +" is Larest");

	}
}
