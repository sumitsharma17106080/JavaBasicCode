package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckArmstrongNumbersN1ToN2 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc =new Scanner(System.in);
		System.out.print("n1=");
		n1=sc.nextInt();
		System.out.print("n2=");
		n2=sc.nextInt();
		
		armStrongNumberN1ToN2(n1, n2);
	}

	private static void armStrongNumberN1ToN2(int n1, int n2) {
		
		for(int n=n1;n<=n2;n++) {
			
			int order=0;
			int s1,s2,s=0;
			s1=s2=n;
			while(s1!=0) {
				s1/=10;
				order++;
			}
			while(s2!=0) {
				int r=s2%10;
				s+=Math.pow(r, order);
				s2/=10;
			}
			if(n==s)System.out.print(n+ " ");
			
			
			
		}
	}

}
