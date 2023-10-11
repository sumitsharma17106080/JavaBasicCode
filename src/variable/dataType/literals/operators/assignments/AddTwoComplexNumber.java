package variable.dataType.literals.operators.assignments;

class Complex{
	int r;
	int i;
	
	public Complex() {
		super();
	}
	public Complex(int r,int i) {
		this.i=i;
		this.r=r;
	}
	
	public String showComplecvalue() {
		return this.r+"+"+this.i+"i";
	}
	
}



public class AddTwoComplexNumber {

	public static void main(String[] args) {
		Complex c1=new Complex(4,5);
		Complex c2=new Complex(2,3);
		Complex c=add(c1,c2);
		
		String result=c.showComplecvalue();
		System.out.println(result);
		
	}
	
	
	
	public static Complex add(Complex c1,Complex c2) {
		Complex c=new Complex();
		c.r=c1.r+c2.r;
		c.i=c1.i+c2.i;
		return c;
		
	}
	

}
