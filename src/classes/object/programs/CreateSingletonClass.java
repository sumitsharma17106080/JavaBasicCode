package classes.object.programs;

class MySingleton{
	private static MySingleton instance;
	
	private MySingleton() {
		
	}
	public static  MySingleton getInstance() {
		if(instance==null)instance= new MySingleton();
		return instance;
	}
}

public class CreateSingletonClass {

	public static void main(String[] args) {
		MySingleton ms1=MySingleton.getInstance();
		MySingleton ms2=MySingleton.getInstance();
		MySingleton ms3=MySingleton.getInstance();
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		
		System.out.println(ms1==ms2 && ms2==ms3);
		

	}

}
