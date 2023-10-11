package classes.object.programs;

class ThisClass{
	int a=10;
	
	public ThisClass() {
		System.out.println("No Argument Constructor ");
	}
	
	public ThisClass(int a) {
		this();
		this.a=a;
	}
	public void method1() {
		System.out.println("ThisClass Method-1 =>" +this.a);
	}
	public void method2() {
		System.out.println("ThisClass Method-1");
		this.method1();
	}
	public ThisClass method3() {
		return this;
	}
}

public class ThisKeywordClass {

	public static void main(String[] args) {
		// this Keyword use refer this Class variable(this.x) , Method(this.method()), and Constructor(this())
		ThisClass tc=new ThisClass(20);
		System.out.println(tc);
		tc.method1();
		tc.method2();
		ThisClass tc1=tc.method3();
		System.out.println(tc1);
	}

}
