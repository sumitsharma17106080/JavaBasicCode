package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		System.out.println("Before Swap =>  a ="+ a+"   ,   b="+b);
		////Approach 1 Using third variable
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swap =>   a ="+ a+"   ,   b="+b);
		
		int a1,b1;
		
		System.out.print("a=");
		a1=sc.nextInt();
		System.out.print("b=");
		b1=sc.nextInt();
		System.out.println("Before Swap =>  a ="+ a1+"   ,   b="+b1);
		////Approach 2 without third variable
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("After Swap =>   a ="+ a1+"   ,   b="+b1);
	}

}
