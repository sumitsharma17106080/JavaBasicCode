package classes.object.programs;

abstract class AbstractClass{
	public abstract void abstractMethod();
	
	public void noramalMethod() {
		System.out.println(" Abstarct class may have a Normal Method");
	}
	public static void staticMethod() {
		System.out.println(" Abstarct class may have a static Method");
		privateMehtod();}
	private static void privateMehtod() {
		System.out.println(" Abstarct class may have a private Method");
	}
}
class MainClass extends AbstractClass{

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println(" Main Implemented  class need to override abstract method ");
		
	}
	
}

public class CreateAbstractClass {

	public static void main(String[] args) {
		//AbstractClass ab=new AbstractClass(); Object of Abstract Class not possible
		MainClass mc=new MainClass();
		AbstractClass ab=new MainClass();
		mc.abstractMethod();
		mc.staticMethod();
		ab.abstractMethod();
		ab.staticMethod();
	}

}
