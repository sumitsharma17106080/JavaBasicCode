package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckPrimeNumbersOneToN {

	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.print(" Enter a Number=");
		n=sc.nextInt();
		// Approach 1 Using Loop boolean check 
		int i,j;
		for(i=2;i<=n;i++) {
			boolean check=false;
			for(j=2;j*j<=i;j++) {
				if(i%j==0) {check=true;
				break;}
				}
			if(!check ) System.out.print(i+" ");
			
			}
		
		//Approach 2 Sieve of Eratosthenes 
		boolean[] prime =new boolean[n+1];
		for(i=2;i<prime.length;i++)prime[i]=true;
		
		for(int p=2;p<prime.length;p++) {
			if(prime[p]==true) {
				for(j=p*p;j<prime.length;j+=p) {
					prime[j]=false;
				}
				
			}
		}
		System.out.println();
		for(int k=1;k<prime.length;k++) {
			if(prime[k]==true)System.out.print(k+" ");
		}
		
		
		}

	}


