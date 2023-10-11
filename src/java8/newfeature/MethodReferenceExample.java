package java8.newfeature;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface Intrf{
	public void m1();
}
class Reference{
	public  static void m() {
		System.out.println("Reference m - static method");
	}
	public  void m2() {
		System.out.println("Reference m - Instance method");
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		//Using Lambda Expression
		Intrf i1=()->System.out.println("Method Using Lambda Expression");
		i1.m1();
		
		//Using static method reference
		Intrf i2=Reference::m;
		i2.m1();
		
		//Using static method reference
		Reference r=new Reference();
		Intrf i3=r::m2;
		i3.m1();
	}

}
