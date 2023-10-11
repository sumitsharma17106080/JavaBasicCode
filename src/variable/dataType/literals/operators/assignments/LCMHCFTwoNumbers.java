package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class LCMHCFTwoNumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		
		//Approach 1 Using Function
		
		int h=HCF(a,b);
		System.out.println("Higest Common Factor ="+h);
		
		int l=a*b/HCF(a,b);
		System.out.println("Least Common Mutiple ="+l);
		
		//Approach Using While Loop && function
		int h2=HCF2(a,b);
		System.out.println("Highest common factor ="+h2);
		
		int l2=a*b/HCF2(a,b);
		System.out.println("Least Common Multiple ="+l2);
		
		
		
		
	}

	private static int HCF2(int a, int b) {
		if(a<b) return HCF2(b,a);
		while(b!=0) {
			int k=a%b;
			a=b;
			b=k;
		}
		return a;
		
	}

	private static int HCF(int a, int b) {
		if(b==0)return a;
		return HCF(b,a%b);
	}

}
