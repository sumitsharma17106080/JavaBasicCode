package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number=");
		num=sc.nextInt();
		//Approach 1 Using Loop
		
		int[] Fibonacci=new int[num];
		Fibonacci[0]=0;
		Fibonacci[1]=1;
		for(int i=2;i<num;i++) {
			Fibonacci[i]=Fibonacci[i-1]+Fibonacci[i-2];
		}
		for(int i:Fibonacci) {
			System.out.print(i+"  ");
		}
		
		//Approach 2 Using Recurssion 
		System.out.println();
		for(int i=0; i<num;i++) {
			System.out.print(fibonacci(i)+"  ");
		}
		
		//Approach 3 Using swapping
		System.out.println();
		int n1=0;
		int n2=1;
		for(int i=0;i<num;i++) {
			System.out.print(n1+"  ");
			int n=n1+n2;
			n1=n2;
			n2=n;
		}
	}

	private static int fibonacci(int num) {
		if(num<=1)  return num;
		
		return fibonacci(num-1)+fibonacci(num-2);
		
	}

}
