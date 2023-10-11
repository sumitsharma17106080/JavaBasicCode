package classes.object.programs;

interface infra{
	int i=0;
	//int j;//  interface varible are final need to initalize  at a time
	// By Default method are public and abstract
	void method1();
	private void privateMethod() {
		System.out.println("Interface Allow Private Method");
	}
	default void defaultMethod() {
		System.out.println("Interface Allow default Method ");
		privateMethod();
	}
	public static void staticMethod() {
		System.out.println("Interface Allow static Method "+i);
	}
}
class ImpClass implements infra{
	public void method1() {
		System.out.println("THis is implemenantion of interface abstract method");
	}
}

public class CreateInterface {

	public static void main(String[] args) {
		
		ImpClass ic=new ImpClass();
		System.out.println(ic.i);
		ic.method1();
		ic.defaultMethod();
		infra.staticMethod();///WOOOOW
		

	}

}
