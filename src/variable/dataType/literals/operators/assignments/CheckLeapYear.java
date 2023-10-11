package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Year=");
		year=sc.nextInt();
		//Approach 1 using if/else 
		if(year%100==0) {
			if(year%400==0) System.out.println(year+" is a Leap Year");
			else System.out.println(year+" is not a Leap Year");
			
		}
		else if(year%4==0) System.out.println(year+" is a Leap Year");
		else System.out.println(year+" is not a Leap Year");
		
		//Approach 2 Using Ternary Operator
		boolean isleap=(year%400==0 ||(year%4==0 && year%100!=0))?true:false;
		if(isleap) System.out.println(year+" IS a Leap Year");
		else System.out.println(year+" is NOT a Leap Year");
		

	}

}
