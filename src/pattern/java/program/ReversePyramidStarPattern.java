package pattern.java.program;

import java.util.Scanner;

public class ReversePyramidStarPattern {

	public static void main(String[] args) {
	int l;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter length =");
	l=sc.nextInt();
	
	for(int i=0;i<l;i++) {
		for(int j=1;j<2*l-i;j++) {
			if(j>i) System.out.print(" * ");
			else System.out.print("   ");
			
		}
		System.out.println();
	}
}
}
