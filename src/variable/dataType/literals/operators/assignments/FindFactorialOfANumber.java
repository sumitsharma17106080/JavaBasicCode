package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class FindFactorialOfANumber {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number=");
		num=sc.nextInt();
		int factorial=1;
		//Approach 1 Using if /else;
		int save=num;
		if (num==0) factorial=1;
		else {
			while(num!=0) {
				factorial=num*factorial;
				num--;
			}
			System.out.println( save +",factoria ="+factorial);
		}
		
		int fact=factorial(save);
		System.out.println( save +" ,factoria ="+fact);
	}

	private static int factorial(int save) {
		int f=1;
		if (save==0) return 1;
		f=save*factorial(save-1);
		return f;
	}

}
