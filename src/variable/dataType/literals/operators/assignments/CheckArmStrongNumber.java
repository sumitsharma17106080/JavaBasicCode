package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckArmStrongNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number=");
		num=sc.nextInt();
		
		int sum=0;
		int save=num;
		while(num!=0) {
			int r=num%10;
			sum+=(r*r*r);
			num/=10;
		}
		if(save==sum) System.out.println(save +" is a ArmStrong Number");
		else System.out.println(save +" is NOT a ArmStrong Number");

	}

}
