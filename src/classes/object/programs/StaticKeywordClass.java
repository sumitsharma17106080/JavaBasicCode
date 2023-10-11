package classes.object.programs;

class Student{
	int stuId;
	String stuName;
	static int std;
	int percantage;
	
	static {
		std=12;
		System.out.println("static="+std);
	}
	
	public  void method() {
		System.out.println("Student stuId=" + stuId + ", stuName=" + stuName + ", percantage=" + percantage );
	}
	public static void method1() {
		System.out.println("mehtod1 static="+std);
	}
	public  class Student10{
		
		String board="Yes 10th Class board";
		
	}
	public static  class Student11{
		
		String board="No 11th Class board";
		
	}
	
}

public class StaticKeywordClass {

	public static void main(String[] args) {
		// static keyword can be use with variable, method, blocks, and nested classes.
		//The static keyword belongs to the class
		//The static keyword in Java is mainly used for memory management.
		Student s1=new Student();
		s1.method();
		s1.method1();
		Student.Student10 s10=new Student().new Student10();
		System.out.println(s10.board);
		Student.Student11 s11=new Student. Student11();
		System.out.println(s11.board);

	}

}
