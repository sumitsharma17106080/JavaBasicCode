package multithreading.java.programs;

public class CheckThreadStatus {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();

		MyRunnable r=new MyRunnable();
		Thread t2 =new Thread(r);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		Thread.sleep(100);
		System.out.println("\n"+t1.isAlive());
		System.out.println(t2.isAlive());
		

	}

}
