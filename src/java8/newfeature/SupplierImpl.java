package java8.newfeature;

import java.util.HashMap;
import java.util.function.Supplier;

public class SupplierImpl {

	public static void main(String[] args) {
		Supplier<HashMap> s1=()->new HashMap<>();
		
		Supplier<String> s2=()->"Java";
		getText(s2);
	}

	public static void getText(Supplier<String> str) {
		System.out.println(str.get().length());
	}
}
