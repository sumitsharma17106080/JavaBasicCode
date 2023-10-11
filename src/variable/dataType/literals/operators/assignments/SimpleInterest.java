package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int p,r;
		double n;
		Scanner sc =new Scanner(System.in);
		System.out.print("Principal Value=");
		p=sc.nextInt();
		System.out.print("Rate=");
		r=sc.nextInt();
		System.out.print("Time(Year)=");
		n=sc.nextDouble();
		
		double interest=(p*r*n)/100;
		System.out.println("Simple Interest ="+interest);

	}

}
