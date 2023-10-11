package methods.java.programs;

class Complex{
	int real;
	int img;
	
	public Complex() {
		
	}
	public Complex(int real,int img) {
		this.real=real;
		this.img=img;
		
	}
	
	public void show() {
		System.out.println(real+"+"+img+"i");
	}
	
}

public class Usage_Compare_Method {
	public static void main(String[] args) {
		int x=30;
		int y=30;
		int n=Integer.compare(x, y);
		System.out.println(n);
		
		Complex c1=new Complex(4,5);
		Complex c2=new Complex(4,5);
		
		n=compare(c1, c2);
		c1.show();
		c2.show();
		System.out.println(n);
		
		

	}
	
	public static int compare(Complex c1,Complex c2) {
		if(c1.real> c2.real) return 1;
		else if(c1.real<c2.real) return -1;
		else if(c1.img>c2.img) return 1;
		else if(c1.img<c2.img) return -1;
		else return 0;
	}

}
