package methods.java.programs;

class Parent{
	int x=0;
static int y=1;

public void methodNS() {
	System.out.println("Parent Non - Static Mehtod : "+"Non-Static Memeber="+x+",Static Memeber="+y);
	methodS();
	x++;
	y++;
}
public static void methodS() {
	System.out.println("Parent Static Mehtod : Only Static Memeber="+y);
	y++;
}
}
class Child extends Parent{
	public void methodNS() {
		System.out.println("Child Non - Static Mehtod : "+"Non-Static Memeber="+super.x+",Static Memeber="+super.y);
		methodS();
		super.x++;
		super.y++;
}
	/* Can not Override Static method
	  public void methodS() {
	 
		System.out.println("Parent Static Mehtod : Only Static Memeber="+y);
	}*/
}

public class Static_and_Nonstatic_Method {

	public static void main(String[] args) {
		// Static method belong to class .Static method can be call without instance.Static method use compile-time or early binding.
		//Static method can NOT be override . Static method can access only static member. static keyword
		
		// Non-Static method belong to instance.Non-static method use runtime or dynamic binding.
		//Non-static method can be Overide . Non Static method can access static/Non-static member.
		start();
	}
	public static void start() {
		System.out.println("Welcome to Start Method , It is static Method");
		Parent p=new Parent();
		p.methodNS();
		p.methodS();
		Parent.methodS();
		
		Child c=new Child();
		c.methodNS();
		c.methodS();
		Child.methodS();
		
	}

}
