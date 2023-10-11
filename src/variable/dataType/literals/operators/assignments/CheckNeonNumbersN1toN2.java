package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckNeonNumbersN1toN2 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc =new Scanner(System.in);
		System.out.print("n1=");
		n1=sc.nextInt();
		System.out.print("n2=");
		n2=sc.nextInt();
		
		neonNumberN1ToN2(n1, n2);
	}

	private static void neonNumberN1ToN2(int n1, int n2) {
		for(int n=n1;n<=n2;n++) {
			int sq=n*n,sum=0;
			while(sq!=0) {
				int r=sq%10;
				sum+=r;
				sq/=10;
			}
			if(sum==n) System.out.println(n +" is a neon Number");
		}
	}

}
