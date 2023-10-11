package methods.java.programs;

class ComplexNumber{
	int real;
	int img;
	
	public ComplexNumber() {
		
	}
	public ComplexNumber(int real,int img) {
		this.real=real;
		this.img=img;
		
	}

	
	public void show() {
		System.out.println(real+"+"+img+"i");
	}
	public boolean equals(ComplexNumber c2) {
		
		if(this.real ==c2.real && this.img== c2.img) return true;
		return false;
	}
	
}


public class Usage_equals_method {

	public static void main(String[] args) {

		ComplexNumber c1=new ComplexNumber(5,5);
		ComplexNumber c2=new ComplexNumber(4,5);
		System.out.println(c1.equals(c2));
		
		

	}

}
