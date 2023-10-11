package variable.dataType.literals.operators.assignments;

import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
		int l,b;
		Scanner sc =new Scanner(System.in);
		System.out.print("length =");
		l=sc.nextInt();
		System.out.print("breath=");
		b=sc.nextInt();
		
		int perimeter=2*(l+b);
		System.out.println("Perimeter = "+perimeter);

	}

}
