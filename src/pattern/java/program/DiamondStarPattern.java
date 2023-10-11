package pattern.java.program;

import java.util.Scanner;

public class DiamondStarPattern {
	public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length =");
		l=sc.nextInt();
		int k=1;
		for(int i=1;i<=2*l;i++) {
			
			if(i<=l) {
			for(int j=1;j<l+i;j++) {
				if(j<=l-i)System.out.print("   ");
				else System.out.print(" * ");
				
			}
			}
			else {
				for(int j=1;j<=l+i;j++) {
					if(j<=3*l-i && j>=k)System.out.print(" * ");
					else System.out.print("   ");
					
				}
				k++;
			}
			System.out.println();
			
		}
	}
	

}
