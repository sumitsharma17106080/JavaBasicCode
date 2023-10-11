package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.print("a=");
		a=sc.nextInt();
		boolean check =false;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) {check=true;
			break;}
		}
		if(check) System.out.println(a+" is not Prime Number");
		else System.out.println(a+" is Prime Number");
	}

}
