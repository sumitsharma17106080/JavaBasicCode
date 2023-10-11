package java8.newfeature;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {

	public static void main(String[] args) {
		BinaryOperator<Integer> b1=(x,y)-> x*2+y*2;
		int result=b1.apply(1, 2);
		System.out.println(result);
		
		BinaryOperator<Double> b2=Math ::pow;
		double result2=b2.apply(4.0, 2.0);
		System.out.println(result2);
		
		

	}

}
