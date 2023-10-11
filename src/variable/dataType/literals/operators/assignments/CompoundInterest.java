package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		int p;
		double r,n;
		Scanner sc =new Scanner(System.in);
		System.out.print("Principal Value=");
		p=sc.nextInt();
		System.out.print("Rate=");
		r=sc.nextDouble();
		System.out.print("Time(Year)=");
		n=sc.nextDouble();
		
		double amount=p*Math.pow((1+r/100),n);
		System.out.println("Amount ="+amount);
		double interest=amount-p;
		System.out.printf("Compound Interest %.2f %n",interest);

	}

}
