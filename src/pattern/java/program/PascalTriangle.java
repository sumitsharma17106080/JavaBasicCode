package pattern.java.program;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length =");
		size=sc.nextInt();
		
	//Approach nCr
		for(int a=0;a<size;a++) {
			
			for(int b=0;b<size-a;b++) {
				System.out.print(" ");
			}
			for(int b=0;b<=a;b++) {
				System.out.print(nCr(a,b)+" ");
			}
			System.out.println();
		}
	//Approach Using Binomial Coefficient
		System.out.println("Using Binomial");
		
		for(int a=1;a<=size;a++) {
			for(int b=0;b<=size-a;b++) {
				System.out.print(" ");
			}
			int C=1;
			for(int b=1;b<=a;b++) {
				System.out.print(C+" ");
				C=C*(a-b)/b;
			}
			System.out.println();
		}
		
	}
	private static int nCr(int n, int r) {
		int fn=factorial(n);
		int fr=factorial(r);
		int fnr=factorial(n-r);
		
		return fn/(fr*fnr);
	}

	private static int factorial(int n) {
		if(n==0) return 1;
		return n*factorial(n-1);
	}
}
