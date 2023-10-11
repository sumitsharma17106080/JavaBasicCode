package multithreading.java.programs;

public class Suspend_ResumeThread {

	public static void main(String[] args) {
		MyThread t1=new MyThread();

		MyRunnable r=new MyRunnable();
		Thread t2 =new Thread(r);
		
		t1.start();
		t1.suspend();
		t2.start();
		t1.resume();

	}

}
