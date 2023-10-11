package classes.object.programs;

class BankAccount{
	private double balance;
	public void setB(double b) {
		this.balance=b;
	}
	public void Balance() {
		System.out.println(" Account balance is "+balance);
	}
}

public class CreateDataHidingClass {

	public static void main(String[] args) {
		BankAccount ba1=new BankAccount();
		//ba1.balance=100000 Not Accessible Data Hiding
		ba1.setB(123431);
		ba1.Balance();
	}

}
