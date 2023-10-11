package classes.object.programs;


class Parent{
	String name;
	String service;
	
	
	public Parent(String name, String service) {
		super();
		this.name = name;
		this.service = service;
	}
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	public void method1() {
		System.out.println("Name of th Parent :"+name);
	}
	public void method2() {
		System.out.println("Service of th Parent :"+service);
	}
}
class Child extends Parent{
	String name;
	public void method1() {
		System.out.println("Name of th Child :"+name);
		
	}
	public Child(String name) {
		 super();
		this.name = name;
	}
	
	
}

public class CreateInheritanceClass {

	public static void main(String[] args) {
		Parent p1=new Parent("A-J","Parenting");
		Child c1 =new Child("Sumit");
		Parent pc1=new Child("Ankit");
		p1.method1();
		p1.method2();
		c1.method1();
		c1.method2();
		pc1.method1();
		pc1.method2();

	}

}
