package pattern.java.program;

import java.util.Scanner;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Left Triangle length =");
		r=sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=r;j++) {
				if(j<=r-i)System.out.print("  ");
				else System.out.print("* ");
				
			}
			System.out.println();
		}
		


	}

}
