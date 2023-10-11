package java8.newfeature;

import java.util.function.Function;

public class FunctionImpl {

	public static void main(String[] args) {
		Function< String,Integer> f1=x->x.length();
		int result =f1.apply("How Are You");
		System.out.println(result);
		
		Function< String,Integer> f2=String::length;
		result =f2.apply("How Are You");
		System.out.println(result);

	}

}
