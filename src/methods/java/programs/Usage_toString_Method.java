package methods.java.programs;

class YouTube{
	String name="YouTube";
	String purpose="Video Streaming platform";
	
	public void method() {
		System.out.println(name +" is  a "+purpose);
	}
	public String toString1(){
		return getClass().getName() +"@"+Integer.toHexString(hashCode());
	}
	@Override
	public String toString() {
		return "YouTube name=" + name + ", purpose=" + purpose;
	}
	
}

public class Usage_toString_Method {

	public static void main(String[] args) {
		YouTube y1=new YouTube();
		y1.method();
		System.out.println(y1.toString());
		System.out.println(y1.toString1());
		

	}

}
