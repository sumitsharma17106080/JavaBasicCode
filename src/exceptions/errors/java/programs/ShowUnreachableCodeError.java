package exceptions.errors.java.programs;

public class ShowUnreachableCodeError {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		System.out.println("Statement 5");
		return;
	  //System.out.println("Statement 6");   //Unreachable code
		

	}

}
