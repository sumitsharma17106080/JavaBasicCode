package pattern.java.program;

import java.util.Scanner;

public class PyramidNumberPattern {

	public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length =");
		l=sc.nextInt();
		
		for(int i=1;i<=l;i++) {
			int k=0;int r=1;
			for(int j=1;j<=l+i;j++) {
				if(j<=l-i) System.out.print("   ");
				else if(j>=l-i && j<=l) {System.out.print(i+k+"  ");
				k++;
				}
				else if(j>l+1) {System.out.print(2*i-r-1+"  ");
			
					r++;
				}
				
			}
			System.out.println();
		}
	}
	}
