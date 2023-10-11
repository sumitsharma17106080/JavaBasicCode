package pattern.java.program;

import java.util.Scanner;

public class PyramidStarPattern {

	public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length =");
		l=sc.nextInt();
		
		for(int i=1;i<=l;i++) {
			for(int j=1;j<=2*l;j++) {
				if(j<=l-i ||j>=l+i) System.out.print("  ");
				else System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
