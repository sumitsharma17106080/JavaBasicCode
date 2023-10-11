package classes.object.programs;

class Super{
	int x=15;
	
	public Super() {
		System.out.println("Super Class Constructor "+ (++x));
		
	}
	public void method() {
		System.out.println("Super Class method");
	}
	
	
}
class Lower extends Super{
	int x=super.x+5;
	public Lower() {
		super();
		System.out.println("Lower Class Constructor "+ (++x));
	}
	public void method() {
		System.out.println("Lower Class method");
		super.method();
	}
	
}

public class SuperKeywordClass {
// Super Keyword use refer Super Class variable(super.x) , Method(super.method()), and Constructor(super())

	public static void main(String[] args) {
		Super s1=new Super();
		Lower l1=new Lower();
		s1.method();
		l1.method();

	}

}
