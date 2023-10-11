package exceptions.errors.java.programs;

public class ShowRuntimeExceptions {

	public static void main(String[] args) {
		try {
			int x=10,y=0;
			int z=x/y;
			
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			String str =null;
			str.charAt(3);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		try {
			int[] arr=new int[] {1,2,3,4,5,6};
			int a=arr[10];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		try {
			Object i=Integer.valueOf(1234);
			String str=(String)i;
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
