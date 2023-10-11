package java8.newfeature;

import java.util.function.Predicate;

public class PredicateImpl {

	public static void main(String[] args) {
		Predicate<Integer> p1=x-> x==5;
		boolean check=p1.test(5);
		System.out.println(check);
		check=p1.test(6);
		System.out.println(check);
		
		Predicate<String> p2=String::isEmpty;
		check=p2.test("");
		System.out.println(check);
		check=p2.test("sumit");
		System.out.println(check);
		
	}

}
