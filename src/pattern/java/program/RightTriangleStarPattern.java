package pattern.java.program;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Right Triangle length =");
		r=sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		

	}

}
