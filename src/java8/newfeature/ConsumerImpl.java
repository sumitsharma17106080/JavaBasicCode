package java8.newfeature;

import java.util.function.Consumer;

public class ConsumerImpl {

	public static void main(String[] args) {
		Consumer<String> c1=x->System.out.println(x+"-sumit");
		c1.accept("ankit");
		Consumer<String> c2=System.out::println;

	}

}
