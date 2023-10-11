package java8.newfeature;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {

	public static void main(String[] args) {
		UnaryOperator<String> uo=x->x.replace("a", "B");
		String result=uo.apply("Sumit Sharma , How are You");
		System.out.println(result);
		
		UnaryOperator<String> uo2=String::toUpperCase;
		result=uo2.apply("Sumit Sharma , How are You");
		System.out.println(result);

	}

}
