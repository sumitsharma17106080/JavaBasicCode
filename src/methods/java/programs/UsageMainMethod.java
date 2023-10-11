package methods.java.programs;

public class UsageMainMethod {

	public final static void main(String ... args) {
		System.out.println("Hello World");
		//private main mehtod
		//private static void main(String[] args) {}
		//Error: Main method not found in class, please define the main method as: public static void main(String[] args)
		
		
		// non-static main mehtod
		//public void main(String[] args)
		//Error: Main method is not static in class test, please define the main method as: public static void main(String[] args)
		
		// non-void return type
		// public static int main(String[] args)
		//Error: Main method must return a value of type void in class Main, please define the main method as: public static void main(String[] args)
	
		//with different main method name //
		//public static void my_main(String[])
		//Error: Main method not found in class, please define the main method as:public static void main(String[] args)
		// main is the identifier that the JVM looks for as the starting point of the java program.
		//main is not a keyword
		
		//final with main method is allowed
		//public final static void main(String[] args)

		//String[] args : command line argument
		//String ... args : Allowed
		
		// Until 1.6v We can print a statement using static block
		// 1.7v Onwards it is impossible to print a statement without main method.
	}

}
