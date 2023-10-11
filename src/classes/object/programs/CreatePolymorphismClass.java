package classes.object.programs;

class Multiple{
	
	public void multiple(int a, int b) {
		System.out.println("Result="+ (a*b));
	}
	public void multiple(double a, double b) {
		System.out.println("Result="+ (a*b));
	}
	
}
class Parent_{
	public void method() {
		System.out.println("This is Parent Method");
	}
}
class SubClass1 extends Parent_{
	public void method() {
		System.out.println("This is SubClass1 Method");
	}
}
class SubClass2 extends Parent_{
	public void method() {
		System.out.println("This is SubClass2 Method");
	}
}

public class CreatePolymorphismClass {

	public static void main(String[] args) {
		Multiple m=new Multiple();
		System.out.println("Overloading : Compile Time PolyMorphism : Static Polymorphism");
		m.multiple(2, 4);
		m.multiple(2.5, 2.6);
		System.out.println();
		System.out.println("Overrriding : RUn Time PolyMorphism : Dynamic Polymorphism");
		Parent_ p;
		p=new Parent_();
		p=new SubClass1();
		p.method();
		p=new SubClass2();
		p.method();
				

	}

}
